package Var1.entitys;

public class Book10 extends LibraryItem implements Describable{
    private String genre;
    private String author;

    public Book10(String title, int year, String genre, String author) {
        super(title, year);
        this.genre = genre;
        this.author = author;
    }

    @Override
    public String getDescribe(String description) {
        return description;
    }
}
