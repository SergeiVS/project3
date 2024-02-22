package application.ui;

import application.core.dto.AddToDoRequest;
import application.service.AddToDoService;


public class AddToDoUiAction implements UIAction{

    private final AddToDoService service;

    homework.Pocker.services.utils.UserInput userInput = new homework.Pocker.services.utils.UserInput();

    public AddToDoUiAction(AddToDoService service) {
        this.service = service;
    }


    @Override
    public void execute() {
        String name = userInput.uiText("Enter task name: ");
        String description = userInput.uiText("Enter task description: ");

        var request = new AddToDoRequest(name, description);
        var response = service.add(request);

        System.out.println("Received response: " + response);

    }

    @Override
    public String getActionName() {
        return "Add ToDo";
    }
}
