package ui;


import dto.Response;
import service.ClientService;
import service.Utils.ResponseCheck;

public class DeleteClientMenu implements MenuCommand {

    private final ClientService service;
    ResponseCheck<Boolean> responseCheck = new ResponseCheck<>();

    public DeleteClientMenu(ClientService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        homework.Pocker.services.utils.UserInput userInput = new homework.Pocker.services.utils.UserInput();
        int idSearch = userInput.uiInt("Please enter client id: ");


        Response<Boolean> response = service.delete(idSearch);

        responseCheck.responseCheck(response);
        return null;
    }

    @Override
    public String getMenuName() {
        return "Delete client";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
