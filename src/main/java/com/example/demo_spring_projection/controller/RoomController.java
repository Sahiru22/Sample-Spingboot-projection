package com.example.demo_spring_projection.controller;

import com.example.demo_spring_projection.dto.RoomCreateRQ;
import com.example.demo_spring_projection.model.Room;
import com.example.demo_spring_projection.service.RoomService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    @PostMapping("")
    public Room create(@Valid @RequestBody RoomCreateRQ form) {
        return roomService.create(form);
    }

    @GetMapping("/{id}")
    public Optional<Room> getById(@PathVariable Long id) {
        return roomService.getById(id);
    }

    @GetMapping()
    public List<Room> list() {
        return roomService.getAll();
    }
}
