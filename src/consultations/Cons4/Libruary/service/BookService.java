package Libruary.service;

import Libruary.entitys.Book;
import Libruary.entitys.Books;

public class BookService {

    UserInput ui = new UserInput();
    private int totalNumberOfBooks;

    private BookService(int totalNumberOfBooks) {
        this.totalNumberOfBooks = ui.uiInt("insert total books number: ");
    }

    private Book createBook(){

        int bookId = ui.uiInt("insert book id:");
        String bookAuthor = ui.uiText("insert book author: ");
        String bookName = ui.uiText("insert book name:");
        Book book = new Book(bookId,bookAuthor,bookName);
        return book;
    }
    private Books createBooksArray(int totalNumberOfBooks){
        Books books = new Books(totalNumberOfBooks);
        return books;
    }

    public  Books fillBooksArray(){
        Books books = createBooksArray(totalNumberOfBooks);

        for (int i = 0; i < books.getBooks().length; i++) {
            books.getBooks()[i] = createBook();
        }
        return books;
    }


}
