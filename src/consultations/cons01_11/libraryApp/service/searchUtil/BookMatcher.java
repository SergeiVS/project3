package consultations.cons01_11.libraryApp.service.searchUtil;


import consultations.cons01_11.libraryApp.entity.Book;

public interface BookMatcher {
    boolean match(Book book);
}
