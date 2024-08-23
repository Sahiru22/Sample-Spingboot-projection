package com.example.demo_spring_projection.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskCreateRQ {

    @NotBlank
    @Size(max = 1000)
    private String task;

    @NotNull
    private LocalDate date;

    @NotBlank
    @Size(max = 60)
    private String assigned;

    @Size(max = 60)
    private String doneBy;

    @NotNull
    private Long roomId;
}
