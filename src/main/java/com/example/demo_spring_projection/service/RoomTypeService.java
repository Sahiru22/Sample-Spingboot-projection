package com.example.demo_spring_projection.service;

import com.example.demo_spring_projection.dto.RoomTypeCreateRQ;
import com.example.demo_spring_projection.model.RoomType;

import java.util.List;
import java.util.Optional;

public interface RoomTypeService {
    RoomType create(RoomTypeCreateRQ form);

    Optional<RoomType> getById(Long id);

    List<RoomType> getAll();
}
