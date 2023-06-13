package com.example.internship_mini_project.entities.dtos;

import com.example.internship_mini_project.entities.Car;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CarEntityMapper implements Function<CarDTO, Car> {
    @Override
    public Car apply(CarDTO carDTO) {
        return Car.builder()
                .idCar(carDTO.idCar())
                .color(carDTO.color())
                .horsePower(carDTO.horsePower())
                .model(carDTO.model())
                .yearOfManufacture(carDTO.yearOfManufacture())
                .build();
    }
}
