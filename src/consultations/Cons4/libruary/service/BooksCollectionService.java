package service;

import Libruary.entitys.Book;
import utils.UserInput;

public class BooksCollectionService {

    Book[] booksCollection;

    UserInput ui = new UserInput();
    private int totalNumberOfBooks;

    private BooksCollectionService(int totalNumberOfBooks) {
        this.totalNumberOfBooks = ui.uiInt("insert total books number: ");
    }

    private Book createBookFromUser(){

        int bookId = ui.uiInt("insert book id:");
        String bookAuthor = ui.uiText("insert book author: ");
        String bookName = ui.uiText("insert book name:");
        Book book = new Book(bookId,bookAuthor,bookName);
      return book;
    }
    private Libruary.entitys.BooksCollections createBooksCollection(int totalNumberOfBooks){
        Libruary.entitys.BooksCollections booksCollections = new Libruary.entitys.BooksCollections(totalNumberOfBooks);
        return booksCollections;
    }

    public Libruary.entitys.BooksCollections fillBooksCollectionFromUser(){
        Libruary.entitys.BooksCollections booksCollection = createBooksCollection(totalNumberOfBooks);

        for (int i = 0; i < booksCollection.getBooksCollection().length; i++) {
            booksCollection.getBooksCollection()[i] = createBookFromUser();
        }
        return booksCollection;
    }
    public Libruary.entitys.BooksCollections fillBooksCollectionFromArray(Book[] books){
        Libruary.entitys.BooksCollections booksCollection = new Libruary.entitys.BooksCollections(books.length);

        for (int i = 0; i < books.length; i++) {
            booksCollection.getBooksCollection()[i] = books[i];
        }
        return booksCollection;
    }


}
