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

		Food food1 = new Food("Lanche natural", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/lanche%20natural.jpeg?raw=true", 15.5);
		Food food2 = new Food("Pizza Margherita", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Pizza%20Margherita.jpeg?raw=true", 12.99);
		Food food3 = new Food("Sushi Combo", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Sushi%20Combo.jpeg?raw=true", 24.99);
		Food food4 = new Food("Hambúrguer gourmet", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Hamburguer%20gourmet.jpeg?raw=true", 17.5);
		Food food5 = new Food("Salada Caesar", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Salada%20Caesar.jpeg?raw=true", 9.99);
		Food food6 = new Food("Massa à carbonara", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Massa%20%C3%A0%20carbonara.jpeg?raw=true", 14.5);
		Food food7 = new Food("Sopa de legumes", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Sopa%20de%20legumes.jpeg?raw=true", 7.99);
		Food food8 = new Food("Tacos mexicanos", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Tacos%20mexicanos.jpeg?raw=true", 10.99);
		Food food9 = new Food("Panqueca de banana", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Panqueca%20de%20banana.jpeg?raw=true", 6.5);
		Food food10 = new Food("Torta de maçã", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Torta.jpeg?raw=true", 6.99);
		Food food11 = new Food("Salada de frutas", "https://github.com/AngeloChiarella/Cardapio-digital-API/blob/master/imgs/Salada%20de%20frutas.jpeg?raw=true", 8.99);

		repository
				.saveAll(Arrays.asList(food1, food2, food3, food4, food5, food6, food7, food8, food9, food10, food11));
	}
}
