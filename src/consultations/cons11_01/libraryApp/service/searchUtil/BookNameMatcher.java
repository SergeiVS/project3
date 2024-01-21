package libraryApp.service.searchUtil;

import libraryApp.entity.Book;

public class BookNameMatcher implements BookMatcher{
    private String bookName;

    public BookNameMatcher(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public boolean match(Book book) {
        return book.getNameOfBook().equals(this.bookName);
    }
}
