package application.service;

import application.core.dto.FindToDoResponse;
import application.core.dto.ToDoDto;
import application.repository.ToDoRepository;
import application.service.validation.CoreError;

import java.util.ArrayList;
import java.util.List;

public class DeleteToDoService {
    private final ToDoRepository repository;

    public DeleteToDoService(ToDoRepository repository) {
        this.repository = repository;
    }


    public FindToDoResponse deleteToDo(Integer id){

        List<CoreError> errors = new ArrayList<>();
        var entity = repository.delete(id);

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
