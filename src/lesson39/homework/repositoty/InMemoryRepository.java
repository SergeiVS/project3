package repositoty;



import entity.Task;

import java.util.List;
import java.util.Optional;

public interface InMemoryRepository {
    public Task add(Task newTask);

    public Optional<Task> findById(Integer id);

    public Optional<Task> findByTaskName(String taskName) ;

    public List<Task> findAll();
}
