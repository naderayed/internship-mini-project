package com.example.internship_mini_project.entities.dtos;

import com.example.internship_mini_project.entities.Car;
import org.springframework.stereotype.Service;

import java.util.function.Function;


@Service
public class CarDTOMapper implements Function<Car, CarDTO> {
    @Override
    public CarDTO apply(Car car) {
        return new CarDTO(
                car.getIdCar(),
                car.getModel(),
                car.getHorsePower(),
                car.getColor(),
                car.getYearOfManufacture()
        );

    }
}
