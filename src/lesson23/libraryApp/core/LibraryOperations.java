package libraryApp.core;

import collections.libraryApp.entity.Book;
import collections.libraryApp.service.InputData;
import collections.libraryApp.service.LibraryServices;
import collections.libraryApp.service.OutputData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LibraryOperations {

    /*
     1)
    - получить от пользователя или другого источника данные о размере нашей коллекции
    - создание коллекции
    - наполнение коллекции:
     - получение данных для создания элементов коллекции
     - проверка корректности данных (валидация) - ?

     2) добавление элементов коллекуии
     - начало
     - конец

     3) поиск элемента по условию
     - удаление этого элемента
     */
        LibraryServices services = new LibraryServices();
        InputData inputData = new InputData();
        OutputData outputData = new OutputData();

        public void run(){
            int sizeOfOurLibrary = inputData.inputNumberOfElements();
            List<Book> ourLibrary = services.createLibrary();
            services.fillLibrary(ourLibrary,sizeOfOurLibrary);
            outputData.printOurLibrary("Our library ", ourLibrary);

        }



}
