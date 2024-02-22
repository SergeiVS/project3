package application.service.validation.rule;


import application.core.dto.AddToDoRequest;
import application.service.validation.ValidationRule;
import service.validation.ValidationException;

public class ToDoDescriptionMaxLengthValidationRule implements ValidationRule {
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getName().length() > 30) {
           throw new ValidationException("ToDo description length must be less that 30 but actual name length is " + request.getName().length());
        }
    }
}
