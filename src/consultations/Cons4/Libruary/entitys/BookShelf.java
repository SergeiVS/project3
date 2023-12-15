package Libruary.entitys;

public class BookShelf {
    private Integer id;
    private Book[] books;

    public BookShelf(Integer id, Book[] books) {
        this.id = id;
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }
    public void printBooks(){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
