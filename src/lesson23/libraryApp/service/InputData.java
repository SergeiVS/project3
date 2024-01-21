package libraryApp.service;

import collections.libraryApp.entity.Author;
import collections.libraryApp.entity.Book;

public class InputData {

    /*
    - получить данные о количестве книг в коллекции
    - получить от пользователя новую книгу (автор, название)
    - запросить от пользователя критерий для поиска
     */

    int countAuthor = 0;
    int countOfBook = 0;

    public int inputNumberOfElements() {
        return 10;
    }

    public Book inputNewBook(){
        countAuthor++;
       countOfBook++;
       String nameOfBook = "Book name " + countOfBook;
        Author author = new Author(countAuthor, "Author " + countAuthor);
        return new Book(countOfBook, author, nameOfBook);
    }

    public String inputSearchCriteria() {
        return "Book name ...";
    }
}
