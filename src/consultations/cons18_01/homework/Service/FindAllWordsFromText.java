package Service;


import Dto.Errors.ErrorsDto;
import Dto.ResponseFindAllWords;
import Entity.TextOperations;
import Entity.TextToSearch;

import java.util.*;


public class FindAllWordsFromText {
TextOperations textOperations = new TextOperations();
Validation validation = new Validation();


public ResponseFindAllWords findAllWords(){

    String[] splitText = textOperations.getSplitText();
    List<ErrorsDto> errors = validation.wordsListCheck(splitText);
    List<String> allwords = new ArrayList<>();

    if (errors.isEmpty()){

        allwords = textOperations.findAllWords(splitText);
        Collections.sort(allwords);
        return  new ResponseFindAllWords(allwords, errors);
    }else
    {
    return new ResponseFindAllWords(allwords, errors);
    }
}
}
