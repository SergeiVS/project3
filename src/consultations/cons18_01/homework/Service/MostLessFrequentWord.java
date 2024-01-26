package Service;

import Dto.Errors.ErrorsDto;
import Dto.ResponseMostAndLessUsedWords;
import Dto.WordDto;
import Entity.TextData;
import Entity.TextOperations;
import Service.Util.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

        List<String> splitText = textData.getSplitText();
        List<ErrorsDto> errors = validation.wordsListCheck(splitText);
        Map<String,Integer> mostFrequent= textData.getMostFrequentWord();
        Map<String,Integer> lessFrequent = textData.getLessFrequentWord();

        return new ResponseMostAndLessUsedWords(mostFrequent, lessFrequent, errors);

    }
}
