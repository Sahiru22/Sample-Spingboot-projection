package com.example.demo_spring_projection.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RoomTypeCreateRQ {

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
