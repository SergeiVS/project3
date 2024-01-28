package task10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapFromSet {

    public Map<String, Integer> mapFromSet(Set<String> stringsSet) {

        Map<String, Integer> workingMap = new HashMap<>();

        for (String string : stringsSet) {

            workingMap.put(string, string.length());
        }
        return workingMap;
    }
}
