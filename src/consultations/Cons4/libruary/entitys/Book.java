package Libruary.entitys;

public class Book {
    private int id;
    private String bookAutor;
    private String bookName;

    public Book(int id, String bookAutor, String bookName) {
        this.id = id;
        this.bookAutor = bookAutor;
        this.bookName = bookName;
    }

    public Book(String bookAutor, String bookName) {
        this.bookAutor = bookAutor;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public String getBookAutor() {
        return bookAutor;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookAutor='" + bookAutor + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
