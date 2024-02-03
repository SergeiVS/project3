package ui;


import dto.Response;
import entity.Client;
import service.ClientService;
import service.Utils.ResponseCheck;

import java.util.List;

public class FindAllClientMenu implements MenuCommand {

    private final ClientService service;

    public FindAllClientMenu(ClientService service) {
        this.service = service;
    }
ResponseCheck<List<Client>> responseCheck = new ResponseCheck<>();
    @Override
    public void executeCommand() {

        Response<List<Client>> response = service.findAll();

        responseCheck.responseCheck(response);

    @Override
    public String getMenuName() {
        return "Find all clients";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
