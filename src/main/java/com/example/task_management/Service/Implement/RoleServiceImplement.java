package com.example.task_management.Service.Implement;

import com.example.task_management.Service.RoleService;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task_management.model.Role;
import com.example.task_management.repository.RoleRepository;
//import com.example.task_management.service.RoleService;

@Service
public class RoleServiceImplement implements RoleService {

    @Autowired
    private RoleRepository repository;
     
    @Override

    public Optional <Role> findOne(Long id) {
        return repository.findById(id);
    }
   
    @Override
    public List <Role>findAll(){
        return repository.findAll();
    }
    @Override
    public void save(Role role) {
       repository.save(role);

    }

    @Override
    public void update(Role role){
        repository.save(role);
}

@Override
public void  delete(Long id){
    repository.deleteById(id);
}

@Override
public void delete(Role role){
     repository.delete(role);
}
}