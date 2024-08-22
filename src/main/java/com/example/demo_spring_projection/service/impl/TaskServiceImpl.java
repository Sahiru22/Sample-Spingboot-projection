package com.example.demo_spring_projection.service.impl;

import com.example.demo_spring_projection.dto.request.TaskCreateRQ;
import com.example.demo_spring_projection.model.Task;
import com.example.demo_spring_projection.repository.TaskRepository;
import com.example.demo_spring_projection.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public Task create(TaskCreateRQ form) {
        return null;
    }
}
