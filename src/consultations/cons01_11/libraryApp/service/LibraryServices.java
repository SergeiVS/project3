package consultations.cons01_11.libraryApp.service;

import consultations.cons01_11.libraryApp.entity.ResponseEntity;
import consultations.cons01_11.libraryApp.repository.BookRepository;
import consultations.cons01_11.libraryApp.service.InputOutput.InputData;
import consultations.cons01_11.libraryApp.service.searchUtil.BookNameMatcher;
import consultations.cons01_11.libraryApp.entity.Book;
import consultations.cons01_11.libraryApp.entity.ResponseStatus;
import consultations.cons01_11.libraryApp.service.searchUtil.BookIdMatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibraryServices {

    BookRepository repository = new BookRepository();
    public List<Book> createLibrary() {
        return repository.getRepository();
    }

    public void fillLibrary(List<Book> ourLibrary, int numberOfElementsAdd){

        InputData inputData = new InputData();
        for (int i = 0; i < numberOfElementsAdd; i++) {
            Book newBook = inputData.inputNewBook();
            ourLibrary.add(newBook);
        }
    }

    public List<Book> searchBookById(List<Book> ourLibrary, Integer searchCriteria){
        BookIdMatcher bookIdMatcher = new BookIdMatcher(searchCriteria);
        ResponseEntity response = repository.findBooks(bookIdMatcher);
        if (response.getStatus().equals(ResponseStatus.OK)){
            return response.getBooks();
        } else {
            System.out.println(response.getStatus().getMessage());
        }
        return new ArrayList<>();
    }

    public List<Book> searchBookByBookName(List<Book> ourLibrary, String searchCriteria){
        BookNameMatcher bookNameMatcher = new BookNameMatcher(searchCriteria);
        ResponseEntity response = repository.findBooks(bookNameMatcher);
        if (response.getStatus().equals(ResponseStatus.OK)){
            return response.getBooks();
        } else {
            System.out.println(response.getStatus().getMessage());
        }
        return new ArrayList<>();
    }



    public void deleteBook(List<Book> ourLibrary, List<Book> booksForDelete){
        for (int i = 0; i < booksForDelete.size(); i++) {
            ourLibrary.remove(booksForDelete.get(i));
        }
    }
    private boolean idHead(){
        Random random = new Random();
        int index = random.nextInt(2);
        return switch (index) {
            case 0 -> false;
            case 1 -> true;
            default -> false;
        };
    }

    public void addElementIntoOurLibrary(List<Book> ourLibrary){
        InputData inputData = new InputData();
        Book newBook = inputData.inputNewBook();
        boolean idHead = idHead();
        if (idHead) {
            ourLibrary.add(0,newBook);
        } else {
            ourLibrary.add(newBook);
        }
    }


}
