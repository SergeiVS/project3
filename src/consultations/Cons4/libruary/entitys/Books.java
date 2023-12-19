package Libruary.entitys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Books {

    private Libruary.entitys.Book[] books;
    public Books(Integer totalNumberOfBooks) {
        this.books = new Libruary.entitys.Book[totalNumberOfBooks];
    }

    public Libruary.entitys.Book[] getBooks() {
        return books;
    }
    @Override
    public String toString() {
        return "Books{" +
                "books=" + Arrays.toString(books) +

                '}';
    }
}
