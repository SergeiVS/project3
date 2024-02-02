package consultations.cons01_11.libraryApp.service.searchUtil;

import consultations.cons01_11.libraryApp.entity.Book;

public class BookIdMatcher implements BookMatcher{
    private int bookId;

    public BookIdMatcher(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean match(Book book) {
        return book.getBookId() == this.bookId;
    }
}
