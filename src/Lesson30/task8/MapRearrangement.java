package task8;

import java.util.HashMap;
import java.util.Map;

public class MapRearrangement {

    public Map<Map<Integer, Integer>, Integer> mapRearrangement(Map<Integer, Integer> integerMap){

        int index = 0;

        Map<Map<Integer, Integer>, Integer> workingMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {

            Map<Integer, Integer> indexMap = new HashMap<>();

            int indexMapValue = entry.getValue();

            int key = entry.getKey();

            indexMap.put(index, indexMapValue);

            workingMap.put(indexMap, key);

            index++;
        }
        return workingMap;
    }


}
