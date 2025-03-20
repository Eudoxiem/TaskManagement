package com.example.task_management.Service;

import java.util.List;
import java.util.Optional;

import com.example.task_management.model.UserTask;

public interface UserTaskService {
    Optional<UserTask> findOne(Long id);
    List<UserTask> findAll();
    void save(UserTask userTask);
    void update(UserTask userTask);
    void delete(Long id);
    void delete(UserTask userTask);

}
