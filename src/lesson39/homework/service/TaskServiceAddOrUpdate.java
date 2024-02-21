package service;


import dto.ClientRequest;
import dto.ClientResponse;
import entity.Task;
import repositoty.InMemoryRepository;
import service.validation.ValidationRequest;

import java.util.ArrayList;
import java.util.List;

public class TaskServiceAddOrUpdate {
    private final InMemoryRepository repository;
    private final ValidationRequest validationRequest;

    public TaskServiceAddOrUpdate(InMemoryRepository repository, ValidationRequest validationRequest) {
        this.repository = repository;
        this.validationRequest = validationRequest;
    }

    public ClientResponse<Integer> add(ClientRequest request){

        List<String> errors = new ArrayList<>();

        boolean checkResult = validationRequest.checkRequestAdd(request, errors);

        if (checkResult) {

            Task taskForAdd = new Task(request.getName(), request.getDescription());

            repository.add(taskForAdd);

            if (taskForAdd.getId() > 0) {
                return new ClientResponse<>(200, taskForAdd.getId(), "Добавление новой задачи прошло успешно!");
            } else {
                return new ClientResponse<>(400, 0, "Новая задача не добавлена!");
            }
        }else return new ClientResponse<>(400, 0, "Новая задача не добавлена!");
    }
}
