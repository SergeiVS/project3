package homework.task10;

import java.util.ArrayList;
import java.util.List;

public class BookT10 {
    //Дан список объектов Book, содержащий информацию о книгах, включая название, автора и список тегов.
    //    Необходимо получить список всех уникальных тегов

    private String title;
    private String Author;
    private List<String> tags;

    public BookT10(String title, String author) {
        this.title = title;
        Author = author;
        this.tags = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "BookT10{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", tags=" + tags +
                '}';
    }
}
