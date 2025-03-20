package com.example.task_management.Service.Implement;

import com.example.task_management.Service.TaskService;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task_management.model.Task;
import com.example.task_management.repository.TaskRepository;


@Service
public class TaskServiceImplement implements TaskService {

    @Autowired
    private TaskRepository repository;
     
    @Override

    public Optional<Task> findOne(Long id) {
        return repository.findById(id);
    }
   
    @Override
    public List <Task>findAll(){
        return repository.findAll();
    }
    @Override
    public void save(Task task) {
       repository.save(task);

    }

    @Override
    public void update(Task task){
        repository.save(task);
}

@Override
public void  delete(Long id){
    repository.deleteById(id);
}

@Override
public void delete(Task task){
     repository.delete(task);
}
}
