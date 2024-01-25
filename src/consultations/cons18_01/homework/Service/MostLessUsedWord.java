package Service;

import Dto.Errors.ErrorsDto;
import Dto.ResponseMostAndLessUsedWords;
import Dto.WordDto;
import Entity.TextOperations;
import Service.Util.Utils;

import java.util.ArrayList;
import java.util.List;

public class MostLessUsedWord {
    TextOperations textOperations = new TextOperations();
    Validation validation = new Validation();

    public ResponseMostAndLessUsedWords mostAndLessUsedWords(){

        String[] splitText =textOperations.getSplitText();
        List<ErrorsDto> errors = validation.wordsListCheck(splitText);
        List<WordDto> mostUsed = new ArrayList<>();
        List<WordDto> lessUsed = new ArrayList<>();
        if (errors.isEmpty()) {

           mostUsed = Utils.mapToList(textOperations.mostUsedWord(splitText));
           lessUsed = Utils.mapToList(textOperations.lessUsedWord(splitText));
           return new ResponseMostAndLessUsedWords(mostUsed, lessUsed,errors);
        }else {

            return new ResponseMostAndLessUsedWords(mostUsed, lessUsed,errors);
        }
    }
}
