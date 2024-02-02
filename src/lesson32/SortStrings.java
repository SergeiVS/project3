package lesson32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortStrings {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "pear", "orange", "grape");

        System.out.println(words);

        words.sort((s1, s2) -> {
                    return (s1.length() - s2.length()) * -1;
                }
        );

        System.out.println(words);
    }
Function<List<Integer>, List<String>> convertStringToLength = list1-> {
        List<Integer> list2 = new ArrayList<>();
        list1.forEach(list1. ));
}

}


