package Libruary.entitys;

import java.util.Arrays;

public class BookCase {
  private BookShelf[] bookShelves;
    public BookCase(int totalNumberOfShelves, int numberOfBooksOnTheShelf) {
      this.bookShelves = new BookShelf[totalNumberOfShelves];
      for (int i = 0; i < totalNumberOfShelves; i++) {
        bookShelves[i] = new BookShelf[numberOfBooksOnTheShelf];
      }
    }

  public BookShelf[] getBookShelves() {
    return bookShelves;
  }

  @Override
  public String toString() {
    return "BookCase{" +
            "bookShelves=" + Arrays.toString(bookShelves) +
            '}';
  }
}
