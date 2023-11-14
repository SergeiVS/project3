package practiceLesson4.library;

public class BookDemo {
    public static void main(String[] args) {

        // Declaration of object 1 and inserting of it`s  part data

        Book book1 = new Book();

        book1.bookShortData("Autor1", "Name1");



        book1.bookPrintOut();

        System.out.println(" ");

        // Inserting of object 1 post reached data

book1.bookAdditionalData(256,856412265.586, true);

        book1.bookPrintOut();

        System.out.println(" ");

        Book book2 = new Book();

        // Declaring of object 2 and inserting of it´s full data

        book2.bookFullData("Autor2", "Name2", 1548, 855648265.758, false);

        System.out.println(" ");



        book2.bookPrintOut();



    }

}
