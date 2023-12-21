package Libruary.entitys;

import java.util.Arrays;

public class BookCase {
  private Integer
  private BookShelf[] bookShelves;
    public BookCase(int totalNumberOfShelves, int numberOfBooksOnTheShelf) {
      this.bookShelves = new BookShelf[totalNumberOfShelves];
      for (int i = 0; i < totalNumberOfShelves; i++) {
        bookShelves[i] = new BookShelf(numberOfBooksOnTheShelf);
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

  public static class BookShelf {
      private Integer id;
      private Libruary.entitys.Book[] booksOnTheShelf;



      public BookShelf(Integer numberOfBooksOnTheShelf) {
          this.booksOnTheShelf = new Libruary.entitys.Book[numberOfBooksOnTheShelf];
      }

      public Libruary.entitys.Book[] getBooksFromTheShelf() {
          return booksOnTheShelf;
      }
      public void printBooks(){
          for (int i = 0; i < booksOnTheShelf.length; i++) {
              System.out.println(booksOnTheShelf[i]);
          }
      }
  }
}
