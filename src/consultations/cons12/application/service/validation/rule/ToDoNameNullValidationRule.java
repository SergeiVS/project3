package application.service.validation.rule;


import application.core.dto.AddToDoRequest;
import application.service.validation.CoreError;
import application.service.validation.ValidationRule;
import service.validation.ValidationException;

import java.util.List;

public class ToDoNameNullValidationRule implements ValidationRule {
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getName() == null) {
           throw new ValidationException("ToDo name must not be null");
        }
    }
}
