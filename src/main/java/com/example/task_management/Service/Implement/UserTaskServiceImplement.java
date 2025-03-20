package com.example.task_management.Service.Implement;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task_management.Service.UserTaskService;
import com.example.task_management.model.UserTask;
import com.example.task_management.repository.UserTaskRepository;

@Service
public class UserTaskServiceImplement implements UserTaskService {

    @Autowired
    private UserTaskRepository repository;
     
    @Override

    public Optional<UserTask> findOne(Long id) {
        return repository.findById(id);
    }
   
    @Override
    public List<UserTask> findAll(){
        return repository.findAll();
    }
    @Override
    public void save(UserTask userTask) {
       repository.save(userTask);

    }

    @Override
    public void update(UserTask userTask){
        repository.save(userTask);
}

@Override
public void  delete(Long id){
    repository.deleteById(id);
}

@Override
public void delete(UserTask userTask){
     repository.delete(userTask);
}
}

