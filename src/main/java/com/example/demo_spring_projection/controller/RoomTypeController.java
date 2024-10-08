package com.example.demo_spring_projection.controller;

import com.example.demo_spring_projection.dto.RoomTypeCreateRQ;
import com.example.demo_spring_projection.model.RoomType;
import com.example.demo_spring_projection.service.RoomTypeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/room-types")
public class RoomTypeController {

    private final RoomTypeService roomTypeService;

    @PostMapping("")
    public RoomType create(@Valid @RequestBody RoomTypeCreateRQ form) {
        return roomTypeService.create(form);
    }

    @GetMapping("/{id}")
    public Optional<RoomType> getById(@PathVariable Long id) {
        return roomTypeService.getById(id);
    }

    @GetMapping()
    public List<RoomType> list() {
        return roomTypeService.getAll();
    }

}
