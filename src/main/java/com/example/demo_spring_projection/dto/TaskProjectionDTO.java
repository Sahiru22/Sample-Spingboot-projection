package com.example.demo_spring_projection.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskProjectionDTO {

    private String task;
    private String doneBy;
}
