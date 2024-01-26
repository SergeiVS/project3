package Service;

import Dto.Errors.ErrorsDto;
import Dto.ResponseMostAndLessUsedWords;
import Dto.WordDto;
import Entity.TextData;
import Entity.TextOperations;
import Service.Util.Utils;

import java.util.ArrayList;
import java.util.List;

public class MostLessFrequentWord {
    private final TextData textData;
    private final TextOperations textOperations;
    private final Validation validation;

    public MostLessFrequentWord(TextOperations textOperations, Validation validation, TextData textData) {
        this.textData = textData;
        this.textOperations = textOperations;
        this.validation = validation;
    }

    public ResponseMostAndLessUsedWords mostAndLessUsedWords(){

        String[] splitText = textData.getSplitText();
        List<ErrorsDto> errors = validation.wordsListCheck(splitText);
        List<WordDto> mostUsed = new ArrayList<>();
        List<WordDto> lessUsed = new ArrayList<>();
        if (errors.isEmpty()) {

           mostUsed = Utils.mapToList(textOperations.mostUsedWord());
           lessUsed = Utils.mapToList(textOperations.lessUsedWord());
           return new ResponseMostAndLessUsedWords(mostUsed, lessUsed,errors);
        }else {

            return new ResponseMostAndLessUsedWords(mostUsed, lessUsed,errors);
        }
    }
}
