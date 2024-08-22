package com.example.demo_spring_projection.repository;

import com.example.demo_spring_projection.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
