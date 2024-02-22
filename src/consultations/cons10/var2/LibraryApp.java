


import entity.Book;
import service.LibraryService;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        service.readFromFile("C:\\Users\\serge\\IdeaProjects\\project3\\src\\consultations\\cons10\\var2\\resources\\books.txt");
        service.printAll();

        System.out.println("------ BOOKS ---------");
        service.printAllBooks();

        System.out.println("------- MAGAZINE -------");
        service.printAllMagazines();

    }
}
