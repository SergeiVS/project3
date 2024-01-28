package task7;

import java.util.Set;
import java.util.TreeSet;

public class BookTest {
    public static void main(String[] args) {


        Book book1 = new Book("Хемингуей", "Прощай оружие!", 11.10);
        Book boo2 = new Book("Дюма", "Сорок пять", 12.30);
        Book book3 = new Book("Милн", "Винни Пух", 14.00);
        Book book4 = new Book("Сартр", "Мухи", 21.50);


        Set<Book> bookSet = new TreeSet<>();

        bookSet.add(book1);
        bookSet.add(boo2);
        bookSet.add(book3);
        bookSet.add(book4);

        System.out.println(bookSet);
    }
}
