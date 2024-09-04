package com.example.carsuggestion.controller;

import com.example.carsuggestion.model.Car;
import com.example.carsuggestion.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/suggest-cars")
    public String suggestCars(@RequestParam String type, @RequestParam double budget, Model model) {
        List<Car> cars = carService.suggestCars(type, budget);
        model.addAttribute("cars", cars);
        return "index";
    }
}
