package ui;


import dto.Response;
import entity.Client;
import service.ClientService;
import service.Utils.ResponseCheck;

public class FindClientByNameMenu implements MenuCommand {

    private final ClientService service;

    public FindClientByNameMenu(ClientService service) {
        this.service = service;
    }

    ResponseCheck<Client> responseCheck = new ResponseCheck<>();

    @Override
    public void executeCommand() {

        homework.Pocker.services.utils.UserInput userInput = new homework.Pocker.services.utils.UserInput();
        String nameSearch = userInput.uiText("Please enter client name: ");

        Response<Client> response = service.findByName(nameSearch);
        responseCheck.responseCheck(response);
        return nameSearch;
    }


    @Override
    public String getMenuName() {
        return "Find client by name";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
