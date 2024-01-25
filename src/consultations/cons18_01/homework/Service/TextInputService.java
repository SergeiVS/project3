package Service;

import Dto.Errors.ErrorsDto;
import Dto.ResponseTextInput;
import Entity.TextOperations;


import java.util.ArrayList;
import java.util.List;

public class TextInputService {

    Validation validation = new Validation();

    TextOperations textOperations = new TextOperations();

    public ResponseTextInput texInput(String textDto){

        List<ErrorsDto> errors;
        errors = validation.ProofIncomingText(textDto);

        if (errors.isEmpty()){

            textOperations.textInput(textDto);

            return new ResponseTextInput("Thank you", errors);
        }else
        {
            return new ResponseTextInput("your text was not accepted", errors);
        }
    }

}
