package com.example.internship_mini_project.repositories;

import com.example.internship_mini_project.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Long> {
}
