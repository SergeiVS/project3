package Libruary.entitys;

public class BookShelf {
    private Integer id;
    private Libruary.entitys.Book[] booksOnTheShelf;



    public BookShelf(Integer numberOfBooksOnTheShelf) {
        this.booksOnTheShelf = new Libruary.entitys.Book[numberOfBooksOnTheShelf];
    }

    public Libruary.entitys.Book[] getBooksFromTheShelf() {
        return booksOnTheShelf;
    }
    public void printBooks(){
        for (int i = 0; i < booksOnTheShelf.length; i++) {
            System.out.println(booksOnTheShelf[i]);
        }
    }
}
