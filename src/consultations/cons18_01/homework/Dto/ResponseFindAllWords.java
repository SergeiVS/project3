package Dto;

import Dto.Errors.ErrorsDto;

import java.util.*;

public class ResponseFindAllWords {
    List<String> allWordsDtoList;
    List<ErrorsDto> errorsDto;


    public ResponseFindAllWords(List<String> allWordsDtoList, List<ErrorsDto> errorsDto) {
        Collections.sort(allWordsDtoList);
        this.errorsDto = errorsDto;
    }

    public List<String> getAllWordsDtoList() {
        return allWordsDtoList;
    }
}
