package com.example.task_management.Service;

import java.util.List;
import com.example.task_management.model.Task;

public interface TaskService {
    Task findOne(Long id);
    List<Task> findAll();
    void save(Task task);
    void update(Task task);
    Long delete(Long id);
    Long delete(Task task);


}
