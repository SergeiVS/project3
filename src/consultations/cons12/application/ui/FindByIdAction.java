package application.ui;

import application.service.FindToDoById;
import homework.Pocker.services.utils.UserInput;

public class FindByIdAction implements UIAction{
    private final FindToDoById findToDoById;
homework.Pocker.services.utils.UserInput ui = new UserInput();
    public FindByIdAction(FindToDoById findToDoById) {
        this.findToDoById = findToDoById;
    }

    @Override
    public void execute() {

        var id = ui.uiInt("Insert id for search:");

        var response = findToDoById.findToDoById(id);

        System.out.println("Received response: " + response);
    }

    @Override
    public String getActionName() {
        return "Find by Id";
    }
}
