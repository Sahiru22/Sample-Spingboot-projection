package com.example.demo_spring_projection.service.impl;

import com.example.demo_spring_projection.repository.RoomRepository;
import com.example.demo_spring_projection.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
}
