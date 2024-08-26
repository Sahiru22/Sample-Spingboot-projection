package com.example.demo_spring_projection.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TaskProjectionDTO {

    private String task;
    private String doneBy;

    public TaskProjectionDTO(String task, String doneBy) {
        this.task = task;
        this.doneBy = doneBy;
    }
}
