package Dto;


import Dto.Errors.ErrorsDto;

import java.util.List;

public class ResponseWordsUsage {


    List<WordDto> wordsInTextsUsage;

    List<ErrorsDto> errorsCode;

    public ResponseWordsUsage(List<WordDto> wordsInTextsUsage, List<ErrorsDto> errorsCode) {
        this.wordsInTextsUsage = wordsInTextsUsage;
        this.errorsCode = errorsCode;
    }

    public List<WordDto> getWordsInTextsUsage() {
        return wordsInTextsUsage;
    }

    public List<ErrorsDto> getErrorsCode() {
        return errorsCode;
    }

    @Override
    public String toString() {
        return "ResponseWordsUsage{" +
                "wordsInTextsUsage=" + wordsInTextsUsage +
                ", errorsCode=" + errorsCode +
                '}';
    }
}
