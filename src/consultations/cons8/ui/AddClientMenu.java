package ui;


import dto.Response;
import entity.Client;
import service.ClientService;
import service.Utils.ResponseCheck;

public class AddClientMenu implements MenuCommand {

    private final ClientService service;
ResponseCheck<Client> responseCheck = new ResponseCheck<>();
    public AddClientMenu(ClientService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Client newClient = service.createClient();

        Response<Client> response = service.add(newClient);

        responseCheck.responseCheck(response);
        return null;
    }

    @Override
    public String getMenuName() {
        return "Add new client";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
