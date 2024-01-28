package task9;

import java.util.Map;
import java.util.Random;

public class FillMap {

    public Map<Integer, Integer> fillMap(Map<Integer, Integer> workingMap, int limit, int size){

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int key = random.nextInt(limit);
            workingMap.put(key, (key * key));
        }
        return workingMap;
    }
}
