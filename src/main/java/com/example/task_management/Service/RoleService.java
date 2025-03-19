package com.example.task_management.Service;

import java.util.List;
import com.example.task_management.model.Role;

public interface RoleService {
    Role findOne(Long id);
    List<Role> findAll();
    void save(Role role);
    void update(Role role);
    Long delete(Long id);
    Long delete(Role role);


}
