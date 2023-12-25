package Libruary.entitys;

import java.util.Arrays;

public class BooksCollections {

    private Libruary.entitys.Book[] booksCollection;

    public void setBooksCollection(Libruary.entitys.Book[] booksCollection) {
        this.booksCollection = booksCollection;
    }

    public BooksCollections(Integer totalNumberOfBooks) {
        this.booksCollection = new Libruary.entitys.Book[totalNumberOfBooks];
    }

    public Libruary.entitys.Book[] getBooksCollection() {
        return booksCollection;
    }
    @Override
    public String toString() {
        return "BooksCollections{" +
                "books=" + Arrays.toString(booksCollection) +

                '}';
    }
}
