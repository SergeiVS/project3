package Service;

import Dto.Errors.ErrorsDto;
import Dto.ResponseWordsUsage;
import Dto.WordDto;
import Entity.TextData;
import Entity.TextOperations;
import Service.Util.Utils;


import java.util.*;

public class FindWordsFrequent {
private final TextData textData;
 private final TextOperations textOperations;
  private final Validation validation;

    public FindWordsFrequent(TextData textData, TextOperations textOperations, Validation validation) {
        this.textData = textData;
        this.textOperations = textOperations;
        this.validation = validation;
    }


    public ResponseWordsUsage wordsUsage(){

        String[] splitText = textData.getSplitText();
        Map<String, Integer> wordUsageMap = textOperations.findWordsUsage();
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


