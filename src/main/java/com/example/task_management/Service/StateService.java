package com.example.task_management.Service;

import java.util.List;
import com.example.task_management.model.State;

public interface StateService {
    State findOne(Long id);
    List<State> findAll();
    void save(State state );
    void update(State state );
    Long delete(Long id);
    Long delete(State state);


}
