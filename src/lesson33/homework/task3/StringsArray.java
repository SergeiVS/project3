package homework.task3;

import java.util.ArrayList;
import java.util.List;

public class StringsArray {

    // коллекция String - получить строку содержащую все элементы этой коллекции

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of("Хорошо ", "живёт ", "на ", "свете ", "Винни ", "Пух!"));

        System.out.println(stringList);

        String collectedString = String.valueOf(stringList.stream()
                .reduce((s1, s2) -> s1 + s2));

        System.out.println(collectedString);
    }

}
