package Libruary.service;

import Libruary.entitys.Book;
import Libruary.entitys.BookCase;
import Libruary.entitys.BookShelf;

public class BookCaseService {
    public BookCase createBookCase(int totalNumberOfShelves){
        BookCase newBookCase = new BookCase(totalNumberOfShelves);
        return newBookCase;
    }

    public boolean putBookOnTheShelf(Book book, int numberOfShelf, BookCase bookcase) {
        BookShelf[] bookshelves = bookcase.getBookShelves();
        BookShelf ourTargetShelf = bookshelves[numberOfShelf];
        Book[] booksOnTheShelf = ourTargetShelf.getBooks();

        Integer freePlace = findFreePlaceOnTheShelf(booksOnTheShelf);

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

}
