package com.example.internship_mini_project.controllers;

import com.example.internship_mini_project.entities.Car;
import com.example.internship_mini_project.services.inerfaces.ICarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final ICarService iCarService;


    @PostMapping("addCar")
    public ResponseEntity<Car> addCar(@RequestBody Car car) throws ClassNotFoundException {
        return ResponseEntity.ok(iCarService.addCar(car));
    }

    @GetMapping("getCar")
    public ResponseEntity<Car> getCar(@RequestParam long idCar) throws ClassNotFoundException {
        return ResponseEntity.ok(iCarService.getCar(idCar));
    }

    @DeleteMapping("deleteCar")
    public ResponseEntity<String> deleteCar(@RequestParam long idCar) {
        iCarService.deleteCar(idCar);
        return ResponseEntity.ok("Car deleted successfully");
    }

}
