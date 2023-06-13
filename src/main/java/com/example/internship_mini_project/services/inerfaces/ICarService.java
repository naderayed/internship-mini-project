package com.example.internship_mini_project.services.inerfaces;

import com.example.internship_mini_project.entities.dtos.CarDTO;

public interface ICarService {

    void addCar(CarDTO car) throws ClassNotFoundException;
    CarDTO getCar(long idCar) throws ClassNotFoundException;
    void deleteCar(long idCar);
}
