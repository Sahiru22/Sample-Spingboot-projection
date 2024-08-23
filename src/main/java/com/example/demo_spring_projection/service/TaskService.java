package com.example.demo_spring_projection.service;

import com.example.demo_spring_projection.dto.TaskCreateRQ;
import com.example.demo_spring_projection.model.Task;

public interface TaskService {
    Task create(TaskCreateRQ form);
}
