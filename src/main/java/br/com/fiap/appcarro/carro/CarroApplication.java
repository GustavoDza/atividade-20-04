package br.com.fiap.appcarro.carro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.fiap.appc.carro.controllers, br.com.fiap.appcarro.carro.config"})
public class CarroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarroApplication.class, args);
	}

}
