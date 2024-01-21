package lesson27.practice27.entytis;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;

    List<Book27> authorsBooks;

    public Author(String name, List<Book27> authorsBooks) {
        this.name = name;
        this.authorsBooks = authorsBooks;
    }
}
