package com.example.internship_mini_project.controllers;

import com.example.internship_mini_project.entities.dtos.CarDTO;
import com.example.internship_mini_project.services.inerfaces.ICarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final ICarService iCarService;

    @PostMapping("addCar")
    public ResponseEntity<String> addCar(@RequestBody CarDTO car) throws ClassNotFoundException {
        iCarService.addCar(car);
        return ResponseEntity.ok("car added successfully");
    }

    @GetMapping("getCar")
    public ResponseEntity<CarDTO> getCar(@RequestParam long idCar) throws ClassNotFoundException {
        return ResponseEntity.ok(iCarService.getCar(idCar));
    }

    @DeleteMapping("deleteCar")
    public ResponseEntity<String> deleteCar(@RequestParam long idCar) {
        iCarService.deleteCar(idCar);
        return ResponseEntity.ok("Car deleted successfully");
    }

}
