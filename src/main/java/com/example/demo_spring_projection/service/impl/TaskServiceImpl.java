package com.example.demo_spring_projection.service.impl;

import com.example.demo_spring_projection.dto.TaskCreateRQ;
import com.example.demo_spring_projection.dto.TaskSummaryDTO;
import com.example.demo_spring_projection.model.Task;
import com.example.demo_spring_projection.repository.RoomRepository;
import com.example.demo_spring_projection.repository.TaskRepository;
import com.example.demo_spring_projection.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final RoomRepository roomRepository;

    @Override
    public Task create(TaskCreateRQ form) {
        Task task = new Task();
        BeanUtils.copyProperties(form, task);
        roomRepository.findById(form.getRoomId()).ifPresent(task::setRoom);
        return taskRepository.save(task);
    }

    @Override
    public Optional<Task> getById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public List<TaskSummaryDTO> getAllTasks() {
        return taskRepository.findAllTask();
    }
}
