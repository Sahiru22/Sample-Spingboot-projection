package com.example.demo_spring_projection.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RoomCreateRQ {

        @NotBlank()
        @Size(max = 100)
        private String name;

        private boolean discontinued;

        @NotNull
        private Long roomTypeId;
}
