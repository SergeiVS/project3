package Libruary.service;

import Libruary.entitys.Book;
import Libruary.entitys.BookCase;
import entitys.BookShelf;
import utils.UserInput;

public class BookCaseService {

    UserInput ui = new UserInput();

    private int numberOfShelvesInTheCase = ui.uiInt("insert number of shelves in the case");
    private int numberOfBookOnEachShelf = ui.uiInt("insert number of books on each shelf:");


    BookCase bookCase;



    private BookCase createBookCase(int numberOfShelvesInTheCase, int numberOfBookOnEachShelf){
        BookCase bookCase = new BookCase(numberOfShelvesInTheCase, numberOfBookOnEachShelf);
        return bookCase;
    }

    public boolean putBookOnTheShelf(Book book, int numberOfShelf, BookCase bookcase) {
        BookShelf[] bookshelves = bookcase.getBookShelves();
        BookShelf ourTargetShelf = bookshelves[numberOfShelf];
        Book[] booksOnTheShelf = ourTargetShelf.getBooksFromTheShelf();

        Integer freePlace = findFreePlaceOnTheShelf(booksOnTheShelf);

        return isPlaceFree(book, freePlace, booksOnTheShelf);
    }

    private static boolean isPlaceFree(Book book, Integer freePlace, Book[] booksOnTheShelf) {
        if (freePlace >= 0) {
            booksOnTheShelf[freePlace] = book;
            return true;
        } else {
            System.out.println("На полке нет свободного места для книги");
            return false;
        }
    }

    private Integer findFreePlaceOnTheShelf( Book[] booksOnTheShelf) {
        Integer quantityBooksOnTheShelf = booksOnTheShelf.length;
        for (int i = 0; i < quantityBooksOnTheShelf; i++) {
            if (booksOnTheShelf[i] == null) {
                return i;
            }
        }
        return  -1;
    }
}
