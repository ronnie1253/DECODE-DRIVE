package com.example.carsuggestion.repository;

import com.example.carsuggestion.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByTypeAndPriceLessThanEqual(String type, double price);
}
