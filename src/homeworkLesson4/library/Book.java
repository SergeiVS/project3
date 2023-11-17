package homeworkLesson4.library;

public class Book {

   // Properties of the object

String autor;

String titel;

int pagesCount;

String catalogNumber;

boolean availability;

//Inserting the object properties in a case of full data availability

    public Book(String autor, String titel, int pagesCount, String catalogNumber, boolean availability){

        this.autor = autor;

        this.titel = titel;

        this.pagesCount = pagesCount;

        this.catalogNumber = catalogNumber;

        this.availability = availability;

    }

//Inserting the object properties in a case of part data availability

    public Book(String autor, String titel){

        this.autor = autor;

        this.titel = titel;
    }


    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", titel='" + titel + '\'' +
                ", pagesCount=" + pagesCount +
                ", catalogNumber='" + catalogNumber + '\'' +
                ", availability=" + availability +
                '}';
    }









}


