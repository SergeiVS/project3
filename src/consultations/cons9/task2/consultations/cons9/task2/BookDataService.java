package consultations.cons9.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class BookDataService {
    private static void addBookItemToList(List<BookItem> bookItems, BookItem bookItem) {
        bookItems.add(bookItem);
    }

    private static BookItem createBookItem(String titel, String author, int yearOfIssue) {
        return new BookItem(titel, author, yearOfIssue);
    }

    private static String extractLineValue(String value) {
        value = value.substring(value.indexOf(":") + 1);
        value = value.replaceAll(",", "");
        value = value.replaceAll("}", "");
        value = value.replaceAll("\"", "").trim();
        return value;
    }

    static Optional<BookItem> findBookByTitle(List<BookItem> bookItems, String title) {
        BookItem book = bookItems.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
        return Optional.ofNullable(book);
    }

    static void printFoundBook(Optional<BookItem> book, String searchedTitle) {
        if (book.isPresent()) {
            System.out.println("Found book is " + book.get());
        } else {
            System.out.println("Book: " + searchedTitle + " not found");
        }
    }

    static List<BookItem> fileDataToList(List<BookItem> bookItems, String filePath) throws IOException {

        String line;
        List<BookItem> newBooksList;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        while ((line = reader.readLine()) != null) {

            if (line.trim().charAt(0) == '{') {
                String titel = line;
                titel = extractLineValue(titel);

                String author = reader.readLine();
                author = extractLineValue(author);

                String yearAsString = reader.readLine();
                yearAsString = extractLineValue(yearAsString);
                int yearOfIssue = Integer.parseInt(yearAsString);

                addIfValidate(bookItems, titel, author, yearOfIssue);
            }
        }
        reader.close();
        newBooksList = bookItems;
        return newBooksList;
    }

    private static void addIfValidate(List<BookItem> bookItems, String titel, String author, int yearOfIssue) {
        if (Validation.stringValidation(titel) && Validation.stringValidation(author) &&
                Validation.yearOfIssueValidation(yearOfIssue)) {
            BookItem bookItem = createBookItem(titel, author, yearOfIssue);

            addBookItemToList(bookItems, bookItem);
        }
    }

    public static class Validation {
        static boolean stringValidation(String string) {
            if (!string.isBlank() && string.length() < 30) {
                return true;
            } else {
                return false;
            }
        }

        static boolean yearOfIssueValidation(Integer year) {
            if (year > 1800) {
                return true;
            } else {
                return false;
            }
        }
    }
}
