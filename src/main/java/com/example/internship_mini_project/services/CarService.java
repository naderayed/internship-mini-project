package com.example.internship_mini_project.services;


import com.example.internship_mini_project.entities.Car;
import com.example.internship_mini_project.repositories.CarRepo;
import com.example.internship_mini_project.services.inerfaces.ICarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService implements ICarService {

    private final CarRepo carRepo;

    @Override
    public Car addCar(Car car) throws ClassNotFoundException {
        if(car != null)
             return  this.carRepo.save(car);

        throw new ClassNotFoundException("car is null , no car found to add");
    }

    @Override
    public Car getCar(long idCar) throws ClassNotFoundException {
        return this.carRepo.findById(idCar)
                .orElseThrow(() -> new ClassNotFoundException("could not find car with id: "+idCar));
    }

    @Override
    public void deleteCar(long idCar) {
        carRepo.deleteById(idCar);
    }
}
