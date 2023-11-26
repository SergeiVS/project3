package lesson4.library;

public class BookDemo {
    public static void main(String[] args) {

        // Edit of object 1 and inserting of it`s  full data

        Book book1 = new Book("Autor1", "Titel1", 345, "4571-25847-YZ", true);

        // Edit of object 2 and inserting it´s part data

        Book book2 = new Book("Autor2","Titel2");

        System.out.println(book1);

        System.out.println("  ");

        System.out.println(book2);

        // Edit of lost data of objekt 2


        BookUtil util = new BookUtil();

        util.editPagesCount(584, book2);

       util.editCatalogNumber("2584-255896-TZF", book2);

        util.editAvailability(true, book2);

        System.out.println(" ");

        System.out.println(book2);















    }

}
