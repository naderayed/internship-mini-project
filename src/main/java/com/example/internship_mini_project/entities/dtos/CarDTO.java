package com.example.internship_mini_project.entities.dtos;

import lombok.Builder;

import java.util.Date;


public record CarDTO(
        long idCar,
        String model,
        int horsePower,
        String color,
        Date yearOfManufacture


) {
}
