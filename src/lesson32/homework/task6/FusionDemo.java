package task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FusionDemo {
    public static void main(String[] args) {

        List<String> strings1 = new ArrayList<>(Arrays.asList("Hello ", "world! "));
        List<String> strings2 =  new ArrayList<>(Arrays.asList("Hello ", "java! "));

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        ListFusionInterface<String> fusionStrings = new ListFusionInterface<String>() {
            @Override
            public List<String> fusionLists(List<String> list1, List<String> list2) {
                list1.addAll(list2);
                return list1;
            }
        };
        System.out.println(fusionStrings.fusionLists(strings1,strings2));
        System.out.println();
        ListFusionInterface<Integer> fusionIntegers = new ListFusionInterface<Integer>() {
            @Override
            public List<Integer> fusionLists(List<Integer> list1, List<Integer> list2) {
                list1.addAll(list2);
                return list1;
            }
        };
        System.out.println(fusionIntegers.fusionLists(numbers1, numbers2));
    }
}
