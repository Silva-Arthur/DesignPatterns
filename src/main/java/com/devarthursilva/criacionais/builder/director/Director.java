package com.devarthursilva.criacionais.builder.director;

import com.devarthursilva.criacionais.builder.builders.Builder;
import com.devarthursilva.criacionais.builder.cars.CarType;
import com.devarthursilva.criacionais.builder.component.Engine;
import com.devarthursilva.criacionais.builder.component.GPSNavigator;
import com.devarthursilva.criacionais.builder.component.Transmission;
import com.devarthursilva.criacionais.builder.component.TripComputer;

public class Director {
	
	public void constructscSportsCar(Builder builder) {
		builder.setCarType(CarType.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0, 0));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}
	
	public void constructscCityCar(Builder builder) {
		builder.setCarType(CarType.CITY_CAR);
		builder.setSeats(5);
		builder.setEngine(new Engine(1.2, 0));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}
	
	public void constructSUV(Builder builder) {
		builder.setCarType(CarType.SUV);
		builder.setSeats(5);
		builder.setEngine(new Engine(2.5, 0));
		builder.setTransmission(Transmission.MANUAL);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

}
