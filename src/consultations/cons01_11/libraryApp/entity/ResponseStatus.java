package consultations.cons01_11.libraryApp.entity;

public enum ResponseStatus {
    OK("Ok"),
    BOOK_NOT_FOUND("Book not found");


    private final String message;

    ResponseStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResponseStatus{" +
                "message='" + message + '\'' +
                '}';
    }
}
