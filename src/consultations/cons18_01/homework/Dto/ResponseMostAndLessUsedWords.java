package Dto;

import Dto.Errors.ErrorsDto;


import java.util.List;

public class ResponseMostAndLessUsedWords {
    private List<WordDto> mostUsedWords;
    private List<WordDto> lessUsedWords;

    private List<ErrorsDto> errorsDto;

    public ResponseMostAndLessUsedWords(List<WordDto> mostUsedWords, List<WordDto> lessUsedWords, List<ErrorsDto> errorsDto) {
        this.mostUsedWords = mostUsedWords;
        this.lessUsedWords = lessUsedWords;
        this.errorsDto = errorsDto;
    }

    public List<WordDto> getMostUsedWords() {
        return mostUsedWords;
    }

    public List<WordDto> getLessUsedWords() {
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
