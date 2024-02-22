package application.ui;

import application.service.FindToDoByIdService;
import homework.Pocker.services.utils.UserInput;

public class FindByIdAction implements UIAction{
    private final FindToDoByIdService service;
homework.Pocker.services.utils.UserInput ui = new UserInput();

    public FindByIdAction(FindToDoByIdService service) {
        this.service = service;
    }


    @Override
    public void execute() {

        var id = ui.uiInt("Insert id for search:");

        var response = service.findToDoById(id);

        System.out.println("Received response: " + response);
    }

    @Override
    public String getActionName() {
        return "Find by Id";
    }
}
