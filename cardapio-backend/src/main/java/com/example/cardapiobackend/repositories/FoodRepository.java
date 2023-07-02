package com.example.cardapiobackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cardapiobackend.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
