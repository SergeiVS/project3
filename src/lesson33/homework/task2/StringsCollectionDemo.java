package homework.task2;

import java.util.List;
import java.util.function.Consumer;

public class StringsCollectionDemo {
    public static void main(String[] args) {

        StringsCollection stringColl = new StringsCollection();

        List<String> stringList = stringColl.getStringList();
        String[] strings = {"1245", "ass", "aaaa", "bcbc", "dwbw", "dgshjk", "123"};

        stringList.addAll(List.of(strings));

        printList(stringList);
        System.out.println();

        printList(stringColl.findOddsLength(stringList));

    }

    public static void printList(List list) {
        list.forEach(System.out::println);
    }

}
