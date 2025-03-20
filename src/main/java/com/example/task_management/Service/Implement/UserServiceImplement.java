package com.example.task_management.Service.Implement;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task_management.Service.UserService;
import com.example.task_management.model.User;
import com.example.task_management.repository.UserRepository;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository repository;
     
    @Override

    public Optional<User> findOne(Long id) {
        return repository.findById(id);
    }
   
    @Override
    public List<User> findAll(){
        return repository.findAll();
    }
    @Override
    public void save(User user) {
       repository.save(user);

    }

    @Override
    public void update(User user){
        repository.save(user);
}

@Override
public void  delete(Long id){
    repository.deleteById(id);
}

@Override
public void delete(User user){
     repository.delete(user);
}
}