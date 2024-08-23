package com.example.demo_spring_projection.service;

import com.example.demo_spring_projection.dto.RoomCreateRQ;
import com.example.demo_spring_projection.model.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    Room create(RoomCreateRQ form);

    Optional<Room> getById(Long id);

    List<Room> getAll();
}
