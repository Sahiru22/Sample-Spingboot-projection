package com.example.demo_spring_projection.repository;

import com.example.demo_spring_projection.dto.TaskProjectionDTO;
import com.example.demo_spring_projection.dto.TaskSummaryDTO;
import com.example.demo_spring_projection.model.Room;
import com.example.demo_spring_projection.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task,Long> {

    //interface based projection with quarry method
    @Query("SELECT t FROM Task t")
    List<TaskSummaryDTO> findAllTask();

    @Query("SELECT new com.example.demo_spring_projection.dto.TaskProjectionDTO(t.task, t.doneBy) " +
            "FROM Task t WHERE t.room = :room ")
    List<TaskProjectionDTO> findTasksByRoom(@Param("room") Optional<Room> room);

    <T> List<T> findByAssigned(String assigned, Class<T> type);

    //interface based projection without quarry method
    List<TaskSummaryDTO> findAllProjectedBy();
}
