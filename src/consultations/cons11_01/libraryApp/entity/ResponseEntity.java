package libraryApp.entity;

import java.util.List;

public class ResponseEntity {
    private List<Book> books;
    private ResponseStatus status;

    public ResponseEntity(List<Book> books, ResponseStatus status) {
        this.books = books;
        this.status = status;
    }

    public List<Book> getBooks() {
        return books;
    }

    public ResponseStatus getStatus() {
        return status;
    }
}
