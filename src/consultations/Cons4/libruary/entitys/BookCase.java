package Libruary.entitys;

import java.util.Arrays;

public class BookCase {
  private Libruary.entitys.BookShelf[] bookShelves;
    public BookCase(int totalNumberOfShelves, int numberOfBooksOnTheShelf) {
      this.bookShelves = new Libruary.entitys.BookShelf[totalNumberOfShelves];
      for (int i = 0; i < totalNumberOfShelves; i++) {
        bookShelves[i] = new Libruary.entitys.BookShelf(numberOfBooksOnTheShelf);
      }
    }

  public Libruary.entitys.BookShelf[] getBookShelves() {
    return bookShelves;
  }

  @Override
  public String toString() {
    return "BookCase{" +
            "bookShelves=" + Arrays.toString(bookShelves) +
            '}';
  }
}
