package Dto;

import Dto.Errors.ErrorsDto;


import java.util.List;
import java.util.Map;

public class ResponseMostAndLessUsedWords {
    private Map<String,Integer> mostUsedWords;
    private  Map<String,Integer> lessUsedWords;

    private List<ErrorsDto> errorsDto;

    public ResponseMostAndLessUsedWords( Map<String,Integer> mostUsedWords,  Map<String,Integer> lessUsedWords, List<ErrorsDto> errorsDto) {
        this.mostUsedWords = mostUsedWords;
        this.lessUsedWords = lessUsedWords;
        this.errorsDto = errorsDto;
    }

    public  Map<String,Integer> getMostUsedWords() {
        return mostUsedWords;
    }

    public  Map<String,Integer> getLessUsedWords() {
        return lessUsedWords;
    }

    public List<ErrorsDto> getErrorsDtoList() {
        return errorsDto;
    }

    @Override
    public String toString() {
        return "ResponseMostAndLessUsedWords{" +
                "mostUsedWords=" + mostUsedWords +
                ", lessUsedWords=" + lessUsedWords +
                ", errorsDtoList=" + errorsDto +
                '}';
    }
}
