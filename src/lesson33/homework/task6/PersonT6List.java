package homework.task6;

import java.util.ArrayList;
import java.util.List;

public class PersonT6List {

    // Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
    // Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их
    private final List<PersonT6> persons;

    public List<PersonT6> getPersons() {
        return persons;
    }

    public PersonT6List() {
        this.persons = new ArrayList<>();
    }

    public List<PersonT6> findPersonsByAge(List<PersonT6> database, Integer lowerAge) {
        return database.stream()
                .filter(p -> p.getAge() >= lowerAge)
                .toList();
    }

    public List<String> findUniqueSkils(List<PersonT6> database) {

        return database.stream()
                .flatMap(p -> p.getSkilsList().stream())
                .distinct()
                .sorted()
                .toList();
    }
}
