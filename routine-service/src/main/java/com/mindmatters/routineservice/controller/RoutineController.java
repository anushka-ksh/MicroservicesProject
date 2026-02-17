package com.mindmatters.routineservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.mindmatters.routineservice.model.Routine;
import com.mindmatters.routineservice.service.RoutineService;

@RestController
@RequestMapping("/api/routines")
public class RoutineController {

    @Autowired
    private RoutineService service;

    @PostMapping
    public Routine createRoutine(@RequestBody Routine routine) {
        return service.createRoutine(routine);
    }

    @GetMapping("/user/{userId}")
    public List<Routine> getUserRoutines(@PathVariable String userId) {
        return service.getRoutines(userId);
    }
}
