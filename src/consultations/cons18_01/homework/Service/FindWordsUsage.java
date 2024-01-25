package Service;

import Dto.Errors.ErrorsDto;
import Dto.ResponseWordsUsage;
import Dto.WordDto;
import Entity.TextOperations;
import Service.Util.Utils;


import java.util.*;

public class FindWordsUsage {

    TextOperations textOperations = new TextOperations();
    Validation validation = new Validation();

    public ResponseWordsUsage wordsUsage(){

        String[] splitText =textOperations.getSplitText();
        Map<String, Integer> wordUsageMap = textOperations.findWordsUsage(splitText);
        List<ErrorsDto> errors = validation.wordsListCheck(splitText);
        List<WordDto> wordUsageList = new ArrayList<>();

        if (errors.isEmpty()){

            wordUsageList = Utils.mapToList(wordUsageMap);
            return new ResponseWordsUsage(wordUsageList, errors);

        }else {

            return new ResponseWordsUsage(wordUsageList, errors);
        }
    }



}


