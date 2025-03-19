package com.example.task_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task_management.model.UserTask;

public interface UserTaskRepository extends JpaRepository <UserTask,Long>{




}
