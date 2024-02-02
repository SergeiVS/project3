package consultations.cons01_11.libraryApp.service.searchUtil;

import consultations.cons01_11.libraryApp.entity.Author;
import consultations.cons01_11.libraryApp.entity.Book;

public class BookAuthorMatcher implements BookMatcher{
    private Author author;

    public BookAuthorMatcher(Author author) {
        this.author = author;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.author);
    }
}
