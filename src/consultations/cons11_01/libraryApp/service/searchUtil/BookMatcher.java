package libraryApp.service.searchUtil;


import libraryApp.entity.Book;

public interface BookMatcher {
    boolean match(Book book);
}
