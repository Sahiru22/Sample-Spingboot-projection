package com.example.demo_spring_projection.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "room_types")
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank()
    @Size(max = 100)
    private String name;

    @NotNull
    private Integer maxAdults;

    @NotNull
    private Integer maxChildren;

    @Size(max = 400)
    private String description;

    @NotNull
    private Float sqm;
}
