package Dto;

import Dto.Errors.ErrorsDto;

import java.util.*;

public class ResponseFindAllWords {
    Set<String> allWordsDtoList;
    List<ErrorsDto> errorsDto;


    public ResponseFindAllWords(Set<String> allWordsDtoList, List<ErrorsDto> errorsDto) {
        this.allWordsDtoList = allWordsDtoList;
        this.errorsDto = errorsDto;
    }

    public Set<String> getAllWordsDtoList() {
        return allWordsDtoList;
    }

    @Override
    public String toString() {
        return "ResponseFindAllWords{" +
                "allWordsDtoList=" + allWordsDtoList +
                ", errorsDto=" + errorsDto +
                '}';
    }
}
