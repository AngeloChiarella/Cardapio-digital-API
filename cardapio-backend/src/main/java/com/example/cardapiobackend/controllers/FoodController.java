package com.example.cardapiobackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapiobackend.entities.Food;
import com.example.cardapiobackend.entities.dto.FoodRequestDTO;
import com.example.cardapiobackend.entities.dto.FoodResponseDTO;
import com.example.cardapiobackend.repositories.FoodRepository;

@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	FoodRepository repository;

	@GetMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<FoodResponseDTO> getAll() {
		List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
		return foodList;
	}
	
	@PostMapping
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public void saveFood(@RequestBody FoodRequestDTO newDto) {
		Food newFood = new Food(newDto);
		repository.save(newFood);
	}
}
