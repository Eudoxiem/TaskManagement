package com.example.task_management.Service;

import java.util.List;
import java.util.Optional;

import com.example.task_management.model.Task;

public interface TaskService {
    Optional<Task> findOne(Long id);
    List<Task> findAll();
    void save(Task task);
    void update(Task task);
    void delete(Long id);
    void delete(Task task);


}
