package task7;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private String Author;
    private String title;
    private Double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(Author, book.Author) && Objects.equals(title, book.title) && Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Author, title, price);
    }

    public Book(String author, String title, Double price) {
        Author = author;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book o) {
        return (this.price.compareTo(o.price) * -1);
    }


}
