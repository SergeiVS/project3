package Service;

import Dto.Errors.ErrorsDto;
import Dto.ResponseWordsFrequency;
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


    public ResponseWordsFrequency wordsUsage(){

        List<String> splitText = textData.getSplitText();
        Map<String, Integer> wordsFrequency = textData.getWordFrequency();
        List<ErrorsDto> errors = validation.wordsListCheck(splitText);

        return new ResponseWordsFrequency(wordsFrequency, errors);


    }



}


