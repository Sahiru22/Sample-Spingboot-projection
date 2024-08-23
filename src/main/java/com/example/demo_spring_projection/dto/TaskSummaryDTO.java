package com.example.demo_spring_projection.dto;

import com.example.demo_spring_projection.model.Room;

import java.time.LocalDate;

public interface TaskSummaryDTO {

    Long getId();

    String getTask();

    LocalDate getDate();

    String getAssigned();

    String getDoneBy();

    Room getRoom();

    interface Room {
        Long getId();

        String getName();
    }
}
