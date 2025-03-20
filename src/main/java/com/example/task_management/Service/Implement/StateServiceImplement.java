package com.example.task_management.Service.Implement;

import com.example.task_management.Service.StateService;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task_management.model.State;
import com.example.task_management.repository.StateRepository;
//import com.example.task_management.service.StateService;

@Service
public class StateServiceImplement implements StateService {

    @Autowired
    private StateRepository repository;
     
    @Override

    public Optional <State> findOne(Long id) {
        return repository.findById(id);
    }
   
    @Override
    public List <State>findAll(){
        return repository.findAll();
    }
    @Override
    public void save(State state) {
       repository.save(state);

    }

    @Override
    public void update(State state){
        repository.save(state);
}

@Override
public void  delete(Long id){
    repository.deleteById(id);
}

@Override
public void delete(State state){
     repository.delete(state);
}
}

