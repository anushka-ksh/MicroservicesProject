package com.mindmatters.routineservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindmatters.routineservice.model.Routine;
import com.mindmatters.routineservice.repository.RoutineRepository;
import java.util.List;

@Service
public class RoutineService {

    @Autowired
    private RoutineRepository repository;

    public Routine createRoutine(Routine routine) {
        return repository.save(routine);
    }

    public List<Routine> getRoutines(String userId) {
        return repository.findByUserId(userId);
    }
}
