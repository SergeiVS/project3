


import repositoty.InMemoryRepository;
import repositoty.TaskInMemoryRepository;
import service.TaskServiceAddOrUpdate;
import service.TaskServiceFind;
import service.validation.ValidationRequest;
import ui.UserInterface;

public class App {
    public static void main(String[] args) {

        InMemoryRepository repository = (InMemoryRepository) new TaskInMemoryRepository();
        ValidationRequest validationRequest = new ValidationRequest();

        TaskServiceAddOrUpdate taskServiceAddOrUpdate = new TaskServiceAddOrUpdate(repository, validationRequest);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);

        UserInterface ui = new UserInterface(taskServiceAddOrUpdate, taskServiceFind);
        ui.menu();
    }
}
