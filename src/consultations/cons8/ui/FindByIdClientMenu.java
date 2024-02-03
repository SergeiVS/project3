package ui;


import dto.Response;
import entity.Client;
import service.ClientService;
import service.Utils.ResponseCheck;

public class FindByIdClientMenu implements MenuCommand {

    private final ClientService service;

    public FindByIdClientMenu(ClientService service) {
        this.service = service;
    }
ResponseCheck<Client> responseCheck = new ResponseCheck<>();
    @Override
    public void executeCommand() {

        homework.Pocker.services.utils.UserInput userInput = new homework.Pocker.services.utils.UserInput();
        int idSearch = userInput.uiInt("Please enter client id: ");

       Response<Client> response = service.findById(idSearch);

        responseCheck.responseCheck(response);
        return null;
    }

    @Override
    public String getMenuName() {
        return "Find client by ID";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
