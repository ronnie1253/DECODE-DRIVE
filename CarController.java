package com.example.carsuggestion.controller;

import com.example.carsuggestion.model.Car;
import com.example.carsuggestion.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/suggest-cars")
    public List<Car> suggestCars(@RequestParam String type, @RequestParam double budget) {
        return carService.suggestCars(type, budget);
    }
}
