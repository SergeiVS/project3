package Repositorys;



import entity.LibraryItem;
import entity.Magazine;
import entitys.Book10;

import java.util.List;

public interface RepositoryInterface {
    public LibraryItem addItem(LibraryItem item);

    List<LibraryItem> findAllItems();

    List<Book10> findAllBooks(List<LibraryItem> items);

    List<Magazine> findAllMagazines(List<LibraryItem> items);
}
