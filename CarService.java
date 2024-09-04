package com.example.carsuggestion.service;

import com.example.carsuggestion.model.Car;
import com.example.carsuggestion.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> suggestCars(String type, double budget) {
        return carRepository.findByTypeAndPriceLessThanEqual(type, budget);
    }
}
