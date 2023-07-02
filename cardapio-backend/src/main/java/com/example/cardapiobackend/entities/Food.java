package com.example.cardapiobackend.entities;

import com.example.cardapiobackend.entities.dto.FoodRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String image;
	private Double price;

	public Food(String title, String image, Double price) {
		this.title = title;
		this.image = image;
		this.price = price;
	}

	public Food(FoodRequestDTO newDto) {
		this.title = newDto.title();
		this.image = newDto.image();
		this.price = newDto.price();
	}

}
