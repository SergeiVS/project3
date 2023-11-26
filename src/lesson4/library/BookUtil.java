package lesson4.library;

public class BookUtil {

    public void editPagesCount( int pagesCount, Book book){

     book.pagesCount = pagesCount;

    }

    public void editCatalogNumber(String catalogNumber, Book book) {

        book.catalogNumber = catalogNumber;
    }

    public void editAvailability( boolean avaiability, Book book){

        book.availability = avaiability;
    }

}
