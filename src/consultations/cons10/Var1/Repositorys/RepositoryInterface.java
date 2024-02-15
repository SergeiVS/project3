package Var1.Repositorys;

import Var1.entitys.Book10;
import Var1.entitys.LibraryItem;
import Var1.entitys.Magazine;

import java.util.List;

public interface RepositoryInterface {
    public LibraryItem addItem(LibraryItem item);

    List<LibraryItem> findAllItems();

    List<Book10> findAllBooks(List<LibraryItem> items);

    List<Magazine> findAllMagazines(List<LibraryItem> items);
}
