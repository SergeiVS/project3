package application.core.dto;

import application.service.validation.CoreError;

import java.util.List;

public class FindToDoResponse {
    private final ToDoDto toDoDto;

    private final List<CoreError> errors;

    public FindToDoResponse(ToDoDto toDoDto, List<CoreError> errors) {
        this.toDoDto = toDoDto;
        this.errors = errors;
    }

    public ToDoDto getToDoDto() {
        return toDoDto;
    }

    public List<CoreError> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "FindToDoResponse{" +
                "toDoDto=" + toDoDto +
                ", errors=" + errors +
                '}';
    }
}
