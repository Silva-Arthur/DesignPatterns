package com.devarthursilva.criacionais.builder;

import com.devarthursilva.criacionais.builder.builders.CarBuilder;
import com.devarthursilva.criacionais.builder.builders.CarManualBuilder;
import com.devarthursilva.criacionais.builder.cars.Car;
import com.devarthursilva.criacionais.builder.cars.Manual;
import com.devarthursilva.criacionais.builder.director.Director;

public class PrincipalDemoBuilder {

	public static void main(String[] args) {
		Director diretor = new Director();
		
		CarBuilder builder = new CarBuilder();
		diretor.constructscSportsCar(builder);
		Car sportCar = builder.getResult();
		System.out.println("Carro construído: " + sportCar.getCarType());
		
		System.out.println("===========================================");
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		diretor.constructscSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("Carro manual construído: " + carManual.print());
	}
}
