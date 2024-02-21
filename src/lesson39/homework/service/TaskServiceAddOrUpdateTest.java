package service;

import dto.ClientRequest;
import dto.ClientResponse;
import entity.Task;
import org.junit.Test;
import repositoty.InMemoryRepository;
import repositoty.TaskInMemoryRepository;
import service.validation.ValidationRequest;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class TaskServiceAddOrUpdateTest {
    InMemoryRepository repository = new TaskInMemoryRepository();
    ValidationRequest validationRequest = new ValidationRequest();
    TaskServiceAddOrUpdate serviceAddOrUpdate = new TaskServiceAddOrUpdate(repository, validationRequest);

    @Test
    public void add() {

        //Потребовалось переопределить equals & Hash code для корректной работы

        ClientRequest request1 = new ClientRequest(-1, "Name1", "Description1");
        ClientResponse<Integer> expectedResult1 = new ClientResponse<>(200, 1, "Добавление новой задачи прошло успешно!");

        ClientRequest request2 = new ClientRequest(0, "Name2", "Description2");
        ClientResponse<Integer> expectedResult2 = new ClientResponse<>(200, 2, "Добавление новой задачи прошло успешно!");

        ClientRequest request3 = new ClientRequest(0, "nam", "Description2");
        ClientResponse<Integer> expectedResult3 = new ClientResponse<>(400, 0, "Новая задача не добавлена!");


        ClientResponse<Integer> actualResult1 = serviceAddOrUpdate.add(request1);
        ClientResponse<Integer> actualResult2 = serviceAddOrUpdate.add(request2);
        ClientResponse<Integer> actualResult3 = serviceAddOrUpdate.add(request3);

        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
        assertEquals(expectedResult3, actualResult3);
    }
}