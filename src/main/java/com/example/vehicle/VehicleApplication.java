package com.example.vehicle;

import com.example.vehicle.entity.Car;
import com.example.vehicle.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VehicleApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleApplication.class, args);

	}

	@Bean
	public CommandLineRunner demo(CarRepository repository) {
		return (args) -> {
			repository.save(new Car("BMW", "3 Series"));

		};
	}

}
