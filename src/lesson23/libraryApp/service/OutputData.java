package libraryApp.service;

import collections.libraryApp.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class OutputData {

    public void printOurLibrary(String message, List<Book> ourLibrary){
        System.out.println(message);
        for (Book book : ourLibrary){
            System.out.println(book);
        }

//        for (int i = 0; i < ourLibrary.size(); i++) {
//            System.out.println(ourLibrary.get(i));
//        }
    }
}
