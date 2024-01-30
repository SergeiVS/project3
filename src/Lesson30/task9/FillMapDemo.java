package task9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FillMapDemo {
    public static void main(String[] args) {

        FillMap fillMap = new FillMap();

        int limit = 100;

        int size = 10;

        Map<Integer, Integer> myMap = fillMap.fillMap(new HashMap<>(), limit, size);

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
