package libraryApp.repository;

import libraryApp.entity.Book;
import libraryApp.entity.ResponseEntity;
import libraryApp.entity.ResponseStatus;
import libraryApp.service.searchUtil.BookMatcher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookRepository {

    private List<Book> repository = new LinkedList<>();

    public BookRepository() {

    }

    public List<Book> getRepository() {
        return repository;
    }

    public ResponseEntity findBooks(BookMatcher matcher){
        ArrayList<Book> listOfFoundBooksForResponse = new ArrayList<>();
        for (Book book : repository) {
            if (matcher.match(book)) {
                listOfFoundBooksForResponse.add(book);
            }
        }

        ResponseStatus status = listOfFoundBooksForResponse.isEmpty() ? ResponseStatus.BOOK_NOT_FOUND : ResponseStatus.OK;

        return new ResponseEntity(listOfFoundBooksForResponse, status);

    }


}
