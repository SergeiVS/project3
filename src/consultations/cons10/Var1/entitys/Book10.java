package entitys;

public class Book10 extends Var1.entitys.LibraryItem implements Var1.entitys.Describable {
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
