package Service;


import Dto.Errors.ErrorsDto;
import Dto.ResponseFindAllWords;
import Entity.TextData;
import Entity.TextOperations;

import java.util.*;


public class FindAllWordsFromText {

private final TextOperations textOperations;
private final Validation validation ;

private final TextData textData;

    public FindAllWordsFromText(TextOperations textOperations, Validation validation, TextData textData) {
        this.textOperations = textOperations;
        this.validation = validation;
        this.textData = textData;
    }



    public ResponseFindAllWords findAllWords(){
       List<String> splitText = textData.getSplitText();
    List<ErrorsDto> errors = validation.wordsListCheck(splitText);
    Set<String> allWords = textData.getAllUniqWords();

        return  new ResponseFindAllWords(allWords, errors);
}

    @Override
    public String toString() {
        return "FindAllWordsFromText{" +
                "textOperations=" + textOperations +
                ", validation=" + validation +
                ", textData=" + textData +
                '}';
    }
}
