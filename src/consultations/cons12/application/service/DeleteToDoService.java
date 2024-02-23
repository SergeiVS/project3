package application.service;

import application.core.dto.FindToDoResponse;
import application.core.dto.ToDoDto;
import application.repository.ToDoRepository;
import application.service.util.Converter;
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

            var toDoDto = Converter.converterFromEntityToDto(entity.get());

            return new FindToDoResponse(toDoDto, errors);
        }else {
            errors.add(new CoreError("ToDo not found"));
            return new FindToDoResponse(null, errors);
        }
    }
}
