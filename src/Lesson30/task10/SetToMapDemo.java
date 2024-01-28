package task10;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetToMapDemo {
    public static void main(String[] args) {

        MapFromSet mapFromSet = new MapFromSet();

        Set<String> strings = new HashSet<>();

        strings.add("working");
        strings.add("sleeping");
        strings.add("going");
        strings.add("staying");
        strings.add("saving");

        Map<String, Integer> myMap = mapFromSet.mapFromSet(strings);

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {

            System.out.println(entry);
        }

    }
}
