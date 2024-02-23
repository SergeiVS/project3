package application.service;

import application.core.dto.FindToDoResponse;
import application.core.dto.ToDoDto;
import application.repository.ToDoRepository;
import application.service.util.Converter;
import application.service.validation.CoreError;

import java.util.ArrayList;
import java.util.List;

public class FindToDoByIdService {
    private final ToDoRepository repository;

    public FindToDoByIdService(ToDoRepository repository) {
        this.repository = repository;
    }
    public FindToDoResponse findToDoById(Integer id){

        List<CoreError> errors = new ArrayList<>();
        var entity = repository.findById(id);

        if (entity.isPresent()){
            var toDoDto = Converter.converterFromEntityToDto(entity.get());

            return new FindToDoResponse(toDoDto, errors);
        }else {
            errors.add(new CoreError("ToDo not found"));
            return new FindToDoResponse(null, errors);
        }
    }
}
