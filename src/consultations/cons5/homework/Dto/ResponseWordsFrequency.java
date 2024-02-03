package Dto;


import Dto.Errors.ErrorsDto;

import java.util.List;
import java.util.Map;

public class ResponseWordsFrequency {


    Map<String, Integer> wordsInTextsUsage;

    List<ErrorsDto> errorsCode;

    public ResponseWordsFrequency(Map<String, Integer> wordsInTextsUsage, List<ErrorsDto> errorsCode) {
        this.wordsInTextsUsage = wordsInTextsUsage;
        this.errorsCode = errorsCode;
    }

    public Map<String, Integer> getWordsInTextsUsage() {
        return wordsInTextsUsage;
    }

    public List<ErrorsDto> getErrorsCode() {
        return errorsCode;
    }

    @Override
    public String toString() {
        return "ResponseWordsFrequency{" +
                "wordsInTextsUsage=" + wordsInTextsUsage +
                ", errorsCode=" + errorsCode +
                '}';
    }
}
