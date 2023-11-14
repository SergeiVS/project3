package practiceLesson4.library;

public class Book {

   // Properties of the object

String autor;

String name;

int listsCount;

double catalogNumber;

boolean availability;

//Inserting the object properties in a case of full data availability

public void bookFullData(String autor, String name, int listsCount, double catalogNumber, boolean availability){

   this.autor = autor;

   this.name = name;

   this.listsCount = listsCount;

   this.catalogNumber = catalogNumber;

   this.availability = availability;

}

//Inserting the object properties in a case of part data availability

public void bookShortData (String autor, String name){

    this.autor = autor;

    this.name = name;


}

//Post Iinserting the object properties in a case of reaching of lost data

public void bookAdditionalData(int listsCount, double catalogNumber, boolean availability ){

    this.listsCount = listsCount;

    this.catalogNumber = catalogNumber;

    this.availability = availability;

}

// Calling out of object´s data

public void bookPrintOut(){



    System.out.println("Autor; " + autor);

    System.out.println("Name: " + name);

    System.out.println("Number of lists: " + listsCount);

    System.out.println("Catalog number: "+ catalogNumber);

    System.out.println("Availability: " + availability);

}


}


