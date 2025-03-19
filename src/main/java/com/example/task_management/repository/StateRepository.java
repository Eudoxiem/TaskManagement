package com.example.task_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task_management.model.State;

public interface StateRepository extends JpaRepository <State,Long>{


}
