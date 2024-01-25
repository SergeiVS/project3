package UserInterfase;

import Dto.ResponseTextInput;
import Service.TextInputService;
import Service.Util.UserInputStatic;


import java.util.Scanner;

public class GetTextMenu implements MenuCommandInterface{

private final TextInputService service;

    public GetTextMenu(TextInputService service) {
        this.service = service;
    }

    @Override
    public boolean executeCommand() {

        String textDto = UserInputStatic.inputString("Insert text");
        ResponseTextInput response = service.texInput(textDto);
        System.out.println(response);
        return true;
    }

    @Override
    public String getCommandName() {
        return "Insert tex for search";
    }
}
