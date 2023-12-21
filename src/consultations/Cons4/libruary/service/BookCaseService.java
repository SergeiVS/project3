package Libruary.service;

import Libruary.entitys.Book;
import Libruary.entitys.BookCase;

public class BookCaseService {

    Libruary.service.UserInput ui = new Libruary.service.UserInput();

    private int numberOfShelvesInTheCase = ui.uiInt("insert number of shelves in the case");
    private int numberOfBookOnEachShelf = ui.uiInt("insert number of books on each shelf:");


    BookCase bookCase;



    private BookCase createBookCase(int numberOfShelvesInTheCase, int numberOfBookOnEachShelf){
        BookCase bookCase = new BookCase(numberOfShelvesInTheCase, numberOfBookOnEachShelf);
        return bookCase;
    }

    public boolean putBookOnTheShelf(Book book, int numberOfShelf, BookCase bookcase) {
        BookCase.BookShelf[] bookshelves = bookcase.getBookShelves();
        BookCase.BookShelf ourTargetShelf = bookshelves[numberOfShelf];
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
