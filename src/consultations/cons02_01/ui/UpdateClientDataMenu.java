package ui;

import dto.Response;
import entity.Client;
import homework.Pocker.services.utils.UserInput;
import repository.ClientDatabase;
import service.ClientService;

public class UpdateClientDataMenu implements MenuCommand {
    ClientDatabase database = new ClientDatabase();
    ClientService service = new ClientService(database);
ResponseCheck<Boolean> responseCheck = new ResponseCheck<>();
    @Override
    public void executeCommand() {

        homework.Pocker.services.utils.UserInput userInput = new UserInput();
        String name = userInput.uiText("Insert client name fo search: ");
        Response<Client> responseOfSearch = service.findByName(name);
        Client clientForUpdate = responseOfSearch.getData();
        String newDescription = userInput.uiText("insert new client description");
        clientForUpdate.setDescription(newDescription);
        Response<Boolean> response = service.update(clientForUpdate);

        responseCheck.responseCheck(response);
    }



    @Override
    public String getMenuName() {

        return "Client update";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
