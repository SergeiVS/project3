package homework.task10;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //Дан список объектов Book, содержащий информацию о книгах, включая название, автора и список тегов.
    //    Необходимо получить список всех уникальных тегов
    private final List<BookT10> labraryList;

    public Library() {
        this.labraryList = new ArrayList<>();
    }

    public List<BookT10> getLabraryList() {
        return labraryList;
    }

    public List<String> findUniqueTags(List<BookT10> books){
        return books.stream()
                .map(b -> b.getTags().stream().toString())
                .distinct()
                .toList();
    }

}
