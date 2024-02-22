package application.service;

import application.core.dto.FindToDoResponse;
import application.core.dto.ToDoDto;
import application.core.entity.ToDoEntity;
import application.repository.ToDoRepository;
import application.service.validation.CoreError;

import java.util.ArrayList;
import java.util.List;

public class FindToDoById {
    private final ToDoRepository repository;

    public FindToDoById(ToDoRepository repository) {
        this.repository = repository;
    }
    public FindToDoResponse findToDoById(Integer id){

        List<CoreError> errors = new ArrayList<>();
        var entity = repository.findById(id);

        if (entity.isPresent()){
            var name = entity.get().getName();
            var description = entity.get().getDescription();

            return new FindToDoResponse(new ToDoDto(name, description), errors);
        }else {
            errors.add(new CoreError("ToDo not found"));
            return new FindToDoResponse(null, errors);
        }
    }
}
