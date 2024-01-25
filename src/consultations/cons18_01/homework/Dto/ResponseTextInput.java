package Dto;

import Dto.Errors.ErrorsDto;


import java.util.List;

public class ResponseTextInput {

    private String response;

    List<ErrorsDto> errorsDtoList;

    public ResponseTextInput(String response, List<ErrorsDto> errorsDtoList) {
        this.response = response;
        this.errorsDtoList = errorsDtoList;
    }

    public String getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return "ResponseTextInput{" +
                "response='" + response + '\'' +
                ", errorsDtoList=" + errorsDtoList +
                '}';
    }

    public List<ErrorsDto> getErrorsDtoList() {
        return errorsDtoList;
    }
}
