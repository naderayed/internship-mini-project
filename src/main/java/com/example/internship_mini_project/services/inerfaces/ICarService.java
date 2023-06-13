package com.example.internship_mini_project.services.inerfaces;

import com.example.internship_mini_project.entities.Car;

public interface ICarService {

    Car addCar(Car car) throws ClassNotFoundException;
    Car getCar(long idCar) throws ClassNotFoundException;
    void deleteCar(long idCar);
}
