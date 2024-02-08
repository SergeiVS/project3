package homework.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryT10 {
    //Дан список объектов Book, содержащий информацию о книгах, включая название, автора и список тегов.
    //    Необходимо получить список всех уникальных тегов
    private final List<BookT10> labraryList;

    public LibraryT10() {
        this.labraryList = new ArrayList<>();
    }

    public List<BookT10> getLabraryList() {
        return labraryList;
    }

    public List<String> findUniqueTags(List<BookT10> books){
        return books.stream()
                .flatMap(b -> b.getTags().stream())
                .distinct()
                .collect(Collectors.toList());
    }

}
