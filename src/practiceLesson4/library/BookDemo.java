package practiceLesson4.library;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.bookShortData("Autor1", "Name1");


        book1.bookPrintOut();

        System.out.println(" ");

book1.bookAdditionalData(256,856412265.586, true);

        book1.bookPrintOut();

        System.out.println(" ");

        Book book2 = new Book();

        book2.bookFullData("Autor2", "Name2", 1548, 855648265.758, false);

        System.out.println(" ");

        book2.bookPrintOut();



    }

}
