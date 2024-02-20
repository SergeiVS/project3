package homework.repositoty;

import homework.entity.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskInMemoryRepository implements InMemoryRepository{
    private int taskId;

    private List<Task> tasks = new ArrayList<>();

    @Override
    public Task add(Task newTask){
        newTask.setId(++taskId);
        tasks.add(newTask);
        return newTask;
    }

    @Override
    public Optional<Task> findById(Integer id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Task> findByTaskName(String taskName) {
        for ( Task task : tasks) {
            if (task.getName().equals(taskName)) {
                return Optional.of(task);
            }
        }
        return Optional.empty();

    }

    @Override
    public List<Task> findAll(){return tasks;}
}
