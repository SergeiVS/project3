package libraryApp.service;

import collections.libraryApp.entity.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LibraryServices {
    public List<Book> createLibrary() {
        return new LinkedList<>();
    }

    public void fillLibrary(List<Book> ourLibrary, int numberOfElementsAdd){
        InputData inputData = new InputData();
        for (int i = 0; i < numberOfElementsAdd; i++) {
            Book newBook = inputData.inputNewBook();
            ourLibrary.add(newBook);
        }
    }

    public List<Book> searchBook(List<Book> ourLibrary, String searchCriteria){
        ArrayList<Book> booksAfterSearch = new ArrayList<>();
        for (int i = 0; i < ourLibrary.size(); i++) {
            if (searchCriteria.equals(ourLibrary.get(i).getNameOfBook())) {
              booksAfterSearch.add(ourLibrary.get(i));
            }
        }
        return booksAfterSearch;
    }

    public void deleteBook(List<Book> ourLibrary, List<Book> booksForDelete){
        for (int i = 0; i < booksForDelete.size(); i++) {
            ourLibrary.remove(booksForDelete.get(i));
        }
    }

}
