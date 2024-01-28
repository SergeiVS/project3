package task8;

import java.util.HashMap;
import java.util.Map;

public class MapRearrangementDemo {
    public static void main(String[] args) {

        MapRearrangement rearrangement = new MapRearrangement();

        Map<Integer, Integer> startMap = new HashMap<>();
        startMap.put(15, 12);
        startMap.put(11, 2);
        startMap.put(45, 12);
        startMap.put(55, 8);
        startMap.put(2, 12);
        startMap.put(4, 52);
        startMap.put(35, 8);
        startMap.put(6, 12);

        for (Map.Entry<Integer, Integer> entry : startMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        Map<Map<Integer, Integer>, Integer> resultMap = rearrangement.mapRearrangement(startMap);

        for (Map.Entry<Map<Integer, Integer>, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
