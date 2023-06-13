package com.example.internship_mini_project.services;


import com.example.internship_mini_project.entities.Car;
import com.example.internship_mini_project.entities.dtos.CarDTO;
import com.example.internship_mini_project.entities.dtos.CarDTOMapper;
import com.example.internship_mini_project.entities.dtos.CarEntityMapper;
import com.example.internship_mini_project.repositories.CarRepo;
import com.example.internship_mini_project.services.inerfaces.ICarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService implements ICarService {

    private final CarRepo carRepo;
    private final CarDTOMapper carDTOMapper;
    private final CarEntityMapper carEntityMapper;

    @Override
    public void addCar(CarDTO car) throws ClassNotFoundException {
        Car carToSave = Optional.of(car).map(carEntityMapper)
                .orElseThrow(() -> new ClassNotFoundException("car is null , no car found to add"));
        this.carRepo.save(carToSave);

    }

    @Override
    public CarDTO getCar(long idCar) throws ClassNotFoundException {
        return this.carRepo.findById(idCar)
                .map(carDTOMapper)
                .orElseThrow(() -> new ClassNotFoundException("could not find car with id: " + idCar));
    }

    @Override
    public void deleteCar(long idCar) {
        carRepo.deleteById(idCar);
    }
}
