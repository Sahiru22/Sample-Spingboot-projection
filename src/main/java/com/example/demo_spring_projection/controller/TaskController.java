package com.example.demo_spring_projection.controller;

import com.example.demo_spring_projection.dto.request.TaskCreateRQ;
import com.example.demo_spring_projection.model.Task;
import com.example.demo_spring_projection.service.TaskService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class TaskController {

    private final TaskService taskService;

    @PostMapping("")
    public Task create(@Valid @RequestBody TaskCreateRQ form) {
        return taskService.create(form);
    }
}
