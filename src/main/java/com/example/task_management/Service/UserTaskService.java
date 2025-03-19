package com.example.task_management.Service;

import java.util.List;
import com.example.task_management.model.UserTask;

public interface UserTaskService {
    UserTask findOne(Long id);
    List<UserTask> findAll();
    void save(UserTask userTask);
    void update(UserTask userTask);
    Long delete(Long id);
    Long delete(UserTask userTask);

}
