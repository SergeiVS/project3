package consultations.cons01_11.libraryApp.service.InputOutput;

import consultations.cons01_11.libraryApp.entity.Author;
import consultations.cons01_11.libraryApp.entity.Book;

import java.util.Random;

public class InputData {

    /*
    - получить данные о количестве книг в коллекции
    - получить от пользователя новую книгу (автор, название)
    - запросить от пользователя критерий для поиска
     */


    public Integer indexGenerator(){
        Random random = new Random();
        return  (random.nextInt(25,100) % random.nextInt(1, 25));
    }

    public Book inputNewBook(){
      int  countAuthor = indexGenerator();
       int countOfBook = indexGenerator();
       String nameOfBook = "Book name " + countOfBook;
        Author author = new Author(countAuthor, "Author " + countAuthor);
        return new Book(countOfBook, author, nameOfBook);
    }

    public String inputSearchCriteria() {
        return "Book # 12";
    }
}
