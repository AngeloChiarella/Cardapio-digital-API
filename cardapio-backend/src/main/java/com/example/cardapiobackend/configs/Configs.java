package com.example.cardapiobackend.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Configuration;

import com.example.cardapiobackend.entities.Food;
import com.example.cardapiobackend.repositories.FoodRepository;

@Configuration
@SpringBootConfiguration
public class Configs implements CommandLineRunner {

	@Autowired
	private FoodRepository repository;

	@Override
	public void run(String... args) throws Exception {

		Food food1 = new Food("Lanche natural", "linda_imagem2.jpg", 15.5);
		Food food2 = new Food("Pizza Margherita", "linda_imagem2.jpg", 12.99);
		Food food3 = new Food("Sushi Combo", "linda_imagem3.jpg", 24.99);
		Food food4 = new Food("Hambúrguer gourmet", "linda_imagem4.jpg", 17.5);
		Food food5 = new Food("Salada Caesar", "linda_imagem5.jpg", 9.99);
		Food food6 = new Food("Massa à carbonara", "linda_imagem6.jpg", 14.5);
		Food food7 = new Food("Sopa de legumes", "linda_imagem7.jpg", 7.99);
		Food food8 = new Food("Tacos mexicanos", "linda_imagem8.jpg", 10.99);
		Food food9 = new Food("Panqueca de banana", "linda_imagem20.jpg", 6.5);
		Food food10 = new Food("Torta de maçã", "linda_imagem13.jpg", 6.99);
		Food food11 = new Food("Salada de frutas", "linda_imagem17.jpg", 8.99);

		repository
				.saveAll(Arrays.asList(food1, food2, food3, food4, food5, food6, food7, food8, food9, food10, food11));
	}
}
