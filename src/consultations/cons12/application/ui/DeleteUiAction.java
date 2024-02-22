package application.ui;

import application.service.DeleteToDoService;

public class DeleteUiAction implements UIAction{
    private final DeleteToDoService service;
    homework.Pocker.services.utils.UserInput ui = new homework.Pocker.services.utils.UserInput();

    public DeleteUiAction(DeleteToDoService service) {
        this.service = service;
    }


    @Override
    public void execute() {

        var id = ui.uiInt("Insert id for search:");

        var response = service.deleteToDo(id);

        System.out.println("Deleted response: " + response);

    }

    @Override
    public String getActionName() {
        return "Delete ToDo";
    }
}
