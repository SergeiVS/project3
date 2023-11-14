package practiceLesson4.library;

public class Book {

String autor;

String name;

int listsCount;

double catalogNumber;

boolean availability;

public void bookFullData(String autor, String name, int listsCount, double catalogNumber, boolean availability){

   this.autor = autor;

   this.name = name;

   this.listsCount = listsCount;

   this.catalogNumber = catalogNumber;

   this.availability = availability;

}
public void bookShortData (String autor, String name){

    this.autor = autor;

    this.name = name;


}

public void bookAdditionalData(int listsCount, double catalogNumber, boolean availability ){

    this.listsCount = listsCount;

    this.catalogNumber = catalogNumber;

    this.availability = availability;

}

public void bookPrintOut(){



    System.out.println("Autor; " + autor);

    System.out.println("Name: " + name);

    System.out.println("Number of lists: " + listsCount);

    System.out.println("Catalog number: "+ catalogNumber);

    System.out.println("Availability: " + availability);

}


}


