package lesson31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample3 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        list1.add("Toronto");
        list1.add("Berlin");
        list1.add("Leipzig");
        list1.add("London");

        list2.add("Paris");
        list2.add("Madrid");
        list2.add("Roma");
        list2.add("Istanbul");

        ListMerge listMerge = (List<String> listA, List<String> listB) -> {

            List<String> newList = new ArrayList<>(listA);
            newList.addAll(listB);
            Collections.sort(newList);
            return newList;
        };

        List<String> unitedList = listMerge.merge(list1, list2);

        for (String s : unitedList) {
            System.out.println(s);
        }
    }


}
