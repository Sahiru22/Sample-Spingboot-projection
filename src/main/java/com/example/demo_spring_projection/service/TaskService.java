package com.example.demo_spring_projection.service;

import com.example.demo_spring_projection.dto.TaskCreateRQ;
import com.example.demo_spring_projection.dto.TaskSummaryDTO;
import com.example.demo_spring_projection.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task create(TaskCreateRQ form);

    Optional<Task> getById(Long id);

    List<Task> getAll();

    List<TaskSummaryDTO> getAllTasks();
}
