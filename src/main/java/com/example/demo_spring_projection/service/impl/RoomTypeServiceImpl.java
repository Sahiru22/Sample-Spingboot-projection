package com.example.demo_spring_projection.service.impl;

import com.example.demo_spring_projection.dto.request.RoomTypeCreateRQ;
import com.example.demo_spring_projection.dto.response.RoomTypeResponse;
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
        BeanUtils.copyProperties(form,roomType);
        return roomTypeRepository.save(roomType);
    }

    @Override
    public Optional<RoomTypeResponse> getById(Long id) {

        Optional<RoomType> roomTypeOptional = roomTypeRepository.findById(id);

        return roomTypeOptional.map(roomType -> RoomTypeResponse.builder()
                .id(roomType.getId())
                .name(roomType.getName())
                .maxAdults(roomType.getMaxAdults())
                .maxChildren(roomType.getMaxChildren())
                .description(roomType.getDescription())
                .sqm(roomType.getSqm())
                .build());
    }

    @Override
    public List<RoomTypeResponse> getAll() {

        List<RoomType> roomTypes = roomTypeRepository.findAll();

        return roomTypes.stream()
                .map(roomType -> RoomTypeResponse.builder()
                        .id(roomType.getId())
                        .name(roomType.getName())
                        .maxAdults(roomType.getMaxAdults())
                        .maxChildren(roomType.getMaxChildren())
                        .description(roomType.getDescription())
                        .sqm(roomType.getSqm())
                        .build())
                .toList();
    }
}
