package com.example.demo_spring_projection.service.impl;

import com.example.demo_spring_projection.dto.RoomCreateRQ;
import com.example.demo_spring_projection.model.Room;
import com.example.demo_spring_projection.repository.RoomRepository;
import com.example.demo_spring_projection.repository.RoomTypeRepository;
import com.example.demo_spring_projection.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final RoomTypeRepository roomTypeRepository;

    @Override
    public Room create(RoomCreateRQ form) {
        Room room = new Room();
        BeanUtils.copyProperties(form,room);
        roomTypeRepository.findById(form.getRoomTypeId()).ifPresent(room::setRoomType);
        return roomRepository.save(room);
    }

    @Override
    public Optional<Room> getById(Long id) {
        return roomRepository.findById(id);
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }
}
