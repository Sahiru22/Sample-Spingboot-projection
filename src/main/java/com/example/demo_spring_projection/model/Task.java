package com.example.demo_spring_projection.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @ManyToOne(optional = true)
    @JoinColumn(name = "room_id")
    private Room room;
}
