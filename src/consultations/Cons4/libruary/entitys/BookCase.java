package Libruary.entitys;

import entitys.BookShelf;

import java.util.Arrays;

public class BookCase {
  private Integer numberOfBooksOnTheShelf;
  private BookShelf[] bookShelves;
    public BookCase(int totalNumberOfShelves, int numberOfBooksOnTheShelf) {
      this.bookShelves = new BookShelf[totalNumberOfShelves];
      for (int i = 0; i < totalNumberOfShelves; i++) {
        bookShelves[i] = new BookShelf(numberOfBooksOnTheShelf);
      }
    }

  public Integer getNumberOfBooksOnTheShelf() {
    return numberOfBooksOnTheShelf;
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
