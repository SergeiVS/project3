package homework.service;

import homework.dto.ClientRequest;
import homework.dto.ClientResponse;
import homework.entity.Task;
import homework.repositoty.InMemoryRepository;
import homework.service.validation.ValidationRequest;

public class TaskServiceAddOrUpdate {
    private final InMemoryRepository repository;
    private final ValidationRequest validationRequest;

    public TaskServiceAddOrUpdate(InMemoryRepository repository, ValidationRequest validationRequest) {
        this.repository = repository;
        this.validationRequest = validationRequest;
    }

    public ClientResponse<Integer> add(ClientRequest request){
        boolean checkResult = validationRequest.checkRequestAdd(request);

        Task taskForAdd = new Task(request.getName(), request.getDescription());

        repository.add(taskForAdd);

        if (taskForAdd.getId() > 0) {
            return new ClientResponse<>(200, taskForAdd.getId(),"Добавление новой задачи прошло успешно!");
        } else {
            return new ClientResponse<>(400, 0, "Новая задача не добавлена!");
        }
    }
}
