package com.example.demo_spring_projection.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank()
    @Size(max = 100)
    private String name;

    private boolean discontinued;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
}
