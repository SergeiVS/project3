package task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapRearrangement {

    public Map<Map<Integer, Integer>, Integer> mapRearrangement(Map<Integer, Integer> integerMap) {

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

    public Map<Integer, List<Integer>> mapRearrangementList(Map<Integer, Integer> integerMap) {

        Map<Integer, List<Integer>> workingMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {

            int value = entry.getValue();

            int key = entry.getKey();

            if(workingMap.containsKey(value)){

                workingMap.get(value).add(key);

            }else {

                List<Integer> valueList = new ArrayList<>();
                valueList.add(key);
                workingMap.put(value, valueList);
            }
        }
        return workingMap;
    }


}
