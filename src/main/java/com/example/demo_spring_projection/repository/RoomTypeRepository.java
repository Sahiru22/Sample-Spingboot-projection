package com.example.demo_spring_projection.repository;

import com.example.demo_spring_projection.model.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomTypeRepository extends JpaRepository<RoomType,Long> {
}
