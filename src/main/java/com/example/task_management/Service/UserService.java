package com.example.task_management.Service;

import java.util.List;
import com.example.task_management.model.User;  

public interface UserService {
    User findOne(Long id);
    List<User> findAll();
    void save(User user);
    void update(User user);
    Long delete(Long id);
    Long delete(User user);

}
