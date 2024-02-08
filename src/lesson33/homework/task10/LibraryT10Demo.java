package homework.task10;

import homework.task2.StringsCollectionDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LibraryT10Demo {
    public static void main(String[] args) {


        LibraryT10 library = new LibraryT10();

        List<BookT10> books = library.getLabraryList();
        books.add(new BookT10("Title1", "Author1"));
        books.get(0).getTags().addAll(List.of(new String[]{"Drama", "Crime"}));
        books.add(new BookT10("Title2", "Author1"));
        books.get(1).getTags().addAll(List.of(new String[]{"Comedy", "Crime"}));
        books.add(new BookT10("Title3", "Author2"));
        books.get(2).getTags().addAll(List.of(new String[]{"Nature", "Family"}));
        books.add(new BookT10("Title4", "Author1"));
        books.get(3).getTags().addAll(List.of(new String[]{"Drama", "Nature"}));
        books.add(new BookT10("Title5", "Author3"));
        books.get(4).getTags().addAll(List.of(new String[]{"Nature", "Crime"}));
        books.add(new BookT10("Title6", "Author4"));
        books.get(5).getTags().addAll(List.of(new String[]{"Doku", "Crime"}));
        books.add(new BookT10("Title7", "Author2"));
        books.get(6).getTags().addAll(List.of(new String[]{"Doku", "Nature"}));
        books.add(new BookT10("Title7", "Author3"));
        books.get(7).getTags().addAll(List.of(new String[]{"Drama", "Doku"}));

        List<String> tags = library.findUniqueTags(books);

        StringsCollectionDemo.printList(tags);


    }
}
