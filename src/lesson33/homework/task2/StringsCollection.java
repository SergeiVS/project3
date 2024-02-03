package homework.task2;

import java.util.ArrayList;
import java.util.List;

public class StringsCollection {
    // коллекция String - получить коллекцию элементов у которых нечетное количество символов

    private final List<String> stringList;

    public StringsCollection() {
        this.stringList = new ArrayList<>();
    }

    public List<String> getStringList() {
        return stringList;
    }

    @Override
    public String toString() {
        return "StringsCollection{" +
                "stringList=" + stringList +
                '}';
    }

    public List<String> findOddsLength(List<String> strings){

        return strings.stream()
                .filter(s -> s.length() % 2 != 0)
                .sorted()
                .toList();
    }
}
