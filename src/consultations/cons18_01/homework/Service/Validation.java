package Service;


import Dto.Errors.ErrorsDto;
import consultations.cons18_01.homework.Dto.Errors.ErrorsCode;

import java.util.ArrayList;
import java.util.List;

public class Validation {

    public List<ErrorsDto> ProofIncomingText(String textDto){
        List<ErrorsDto> errorDtoList = new ArrayList<>();

        if (textDto.isBlank()){
            addError(errorDtoList, ErrorsCode.ERRORS_CODE1, "Text should not be blank");
        }

        if (textDto.length()< 10){
            addError(errorDtoList, consultations.cons18_01.homework.Dto.Errors.ErrorsCode.ERRORS_CODE2, "Text should be longer as 10 symbols");
        }
return errorDtoList;
    }

    public List<ErrorsDto> wordsListCheck(String[] splitText){

        List<ErrorsDto> errorDtoList = new ArrayList<>();
        if (splitText.length == 0){

            errorDtoList.add(new ErrorsDto(ErrorsCode.ERRORS_CODE3, "Internal error"));
        }
        return errorDtoList;
    }

    private static boolean addError(List<ErrorsDto> errorDtoList, consultations.cons18_01.homework.Dto.Errors.ErrorsCode errorCode, String description) {
        return errorDtoList.add(new ErrorsDto(errorCode, description));
    }
}
