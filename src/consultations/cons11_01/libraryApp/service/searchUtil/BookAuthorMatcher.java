package libraryApp.service.searchUtil;

import libraryApp.entity.Author;
import libraryApp.entity.Book;

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
