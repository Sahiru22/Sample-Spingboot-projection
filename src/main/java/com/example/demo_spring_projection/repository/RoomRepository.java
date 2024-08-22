package com.example.demo_spring_projection.repository;

import com.example.demo_spring_projection.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
