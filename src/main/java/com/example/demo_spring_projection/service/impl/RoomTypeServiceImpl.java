package com.example.demo_spring_projection.service.impl;

import com.example.demo_spring_projection.dto.RoomTypeCreateRQ;
import com.example.demo_spring_projection.model.RoomType;
import com.example.demo_spring_projection.repository.RoomTypeRepository;
import com.example.demo_spring_projection.service.RoomTypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RoomTypeServiceImpl implements RoomTypeService {

    private final RoomTypeRepository roomTypeRepository;

    @Override
    public RoomType create(RoomTypeCreateRQ form) {
        RoomType roomType = new RoomType();
        BeanUtils.copyProperties(form, roomType);
        return roomTypeRepository.save(roomType);
    }

    @Override
    public Optional<RoomType> getById(Long id) {
       return roomTypeRepository.findById(id);
    }

    @Override
    public List<RoomType> getAll() {
        return roomTypeRepository.findAll();
    }
}

