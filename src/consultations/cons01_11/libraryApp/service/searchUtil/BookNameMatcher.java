package consultations.cons01_11.libraryApp.service.searchUtil;

import consultations.cons01_11.libraryApp.entity.Book;

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
