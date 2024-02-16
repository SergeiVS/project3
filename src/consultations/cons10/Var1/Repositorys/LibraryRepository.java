package Repositorys;


import entity.LibraryItem;
import entity.Magazine;
import entitys.Book10;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepository implements RepositoryInterface {

    private final List<LibraryItem> libraryItems;

    public LibraryRepository() {
        this.libraryItems = new ArrayList<>();
    }
@Override
    public LibraryItem addItem(LibraryItem item){
        libraryItems.add(item);
        return item;
    }

    @Override
    public List<LibraryItem> findAllItems() {
        return libraryItems;
    }

    @Override
    public List<Book10> findAllBooks(List<LibraryItem> items) {
        return null;
    }

    @Override
    public List<Magazine> findAllMagazines(List<LibraryItem> items) {
        return null;
    }

}
