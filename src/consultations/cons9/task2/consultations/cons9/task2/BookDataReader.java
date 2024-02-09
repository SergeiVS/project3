package consultations.cons9.task2;

import homework.task2.StringsCollectionDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDataReader {
    public static void main(String[] args) throws IOException {

        String filePath = "src/consultations/cons9/task2/booksData.txt";
        List<BookItem> bookItems = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        bookItems = BookDataService.fileDataToList(bookItems, filePath);

        StringsCollectionDemo.printList(bookItems);

        Optional<BookItem> foundBook = BookDataService.findBookByTitle(bookItems, "title3");

        BookDataService.printFoundBook(foundBook, "title3");
    }

}
