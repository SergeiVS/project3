package application;

import application.repository.ArrayListRepository;
import application.repository.ToDoRepository;
import application.service.AddToDoService;
import application.service.FindToDoService;
import application.service.validation.ValidationRule;
import application.service.validation.ValidationService;
import application.service.validation.rule.*;
import application.ui.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // создаем наш репозиторий
        ToDoRepository repository = new ArrayListRepository();

        // создаем правила валидации
        // запишем их в коллекцию для передачи в сервис

        ArrayList<ValidationRule> validationRules = new ArrayList<>();
        validationRules.add(new ToDoNameNullValidationRule());
        validationRules.add(new ToDoNameMinLengthValidationRule());
        validationRules.add(new ToDoNameMaxLengthValidationRule());
        validationRules.add(new ToDoDescriptionNullValidationRule());
        validationRules.add(new ToDoDescriptionMaxLengthValidationRule());

        // создаем ValidationService куда передаем список правил

        ValidationService validationService = new ValidationService(validationRules);

        AddToDoService addToDoService = new AddToDoService(repository, validationService);
        FindToDoService findToDoService = new FindToDoService(repository);

        AddToDoUiAction addToDoUiAction = new AddToDoUiAction(addToDoService);
        FindToDoUiAction findToDoUiAction = new FindToDoUiAction(findToDoService);
        ExitUiAction exitUiAction = new ExitUiAction();

        List<UIAction> actions = new ArrayList<>();
        actions.add(addToDoUiAction);
        actions.add(findToDoUiAction);
        actions.add(exitUiAction);

        UIMenu menu = new UIMenu(actions);

        menu.startUI();

    }
}
