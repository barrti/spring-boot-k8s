package com.pgs.workshop.controller;

import com.pgs.workshop.model.Car;
import com.pgs.workshop.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SampleController {

    private final CarRepository carRepository;

    public SampleController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    List<Car> getCars() {
        return carRepository.findAll();
    }

    @PostMapping("/cars")
    Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

}
