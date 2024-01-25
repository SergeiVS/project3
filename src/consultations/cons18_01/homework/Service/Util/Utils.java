package Service.Util;

import Dto.WordDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Utils {
    public static List<WordDto> mapToList(Map<String, Integer> wordUsageMap) {

        List<WordDto> listWordDto = new ArrayList<>();
        for (Map.Entry<String, Integer> entrey : wordUsageMap.entrySet() ) {
            listWordDto.add(new WordDto(entrey.getKey(), entrey.getValue()));
        }
        return listWordDto;
    }
}
