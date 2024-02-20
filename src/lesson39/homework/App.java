package homework;

import homework.repositoty.InMemoryRepository;
import homework.repositoty.TaskInMemoryRepository;
import homework.service.TaskServiceAddOrUpdate;
import homework.service.TaskServiceFind;
import homework.service.validation.ValidationRequest;
import homework.ui.UserInterface;

public class App {
    {

        InMemoryRepository repository = (InMemoryRepository) new TaskInMemoryRepository();
        ValidationRequest validationRequest = new ValidationRequest();

        TaskServiceAddOrUpdate taskServiceAddOrUpdate = new TaskServiceAddOrUpdate(repository, validationRequest);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);

        UserInterface ui = new UserInterface(taskServiceAddOrUpdate, taskServiceFind);
        ui.menu();
    }
}
