package com.example.demo_spring_projection.repository;

import com.example.demo_spring_projection.dto.TaskSummaryDTO;
import com.example.demo_spring_projection.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    @Query("SELECT t FROM Task t")
    List<TaskSummaryDTO> findAllTask();
}
