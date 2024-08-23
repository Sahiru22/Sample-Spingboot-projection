package com.example.demo_spring_projection.service;

import com.example.demo_spring_projection.dto.request.RoomTypeCreateRQ;
import com.example.demo_spring_projection.dto.response.RoomTypeResponse;
import com.example.demo_spring_projection.model.RoomType;

import java.util.List;
import java.util.Optional;

public interface RoomTypeService {
    RoomType create(RoomTypeCreateRQ form);

    Optional<RoomTypeResponse> getById(Long id);

    List<RoomTypeResponse> getAll();
}
