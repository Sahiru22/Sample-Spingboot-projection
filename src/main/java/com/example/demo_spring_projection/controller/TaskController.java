package com.example.demo_spring_projection.controller;

import com.example.demo_spring_projection.dto.TaskCreateRQ;
import com.example.demo_spring_projection.dto.TaskProjectionDTO;
import com.example.demo_spring_projection.dto.TaskSummaryDTO;
import com.example.demo_spring_projection.model.Task;
import com.example.demo_spring_projection.service.TaskService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @PostMapping("")
    public Task create(@Valid @RequestBody TaskCreateRQ form) {
        return taskService.create(form);
    }

    @GetMapping("/Interface-projection")
    public List<TaskSummaryDTO> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/room/{roomId}")
    public List<TaskProjectionDTO> getTasksByRoom(@PathVariable("roomId") Long roomId) {
        return taskService.getTasksByRoom(roomId);
    }

    @GetMapping("/{id}")
    public Optional<Task> getById(@PathVariable Long id) {
        return taskService.getById(id);
    }

    @GetMapping()
    public List<Task> list() {
        return taskService.getAll();
    }
}
