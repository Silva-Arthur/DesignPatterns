package com.devarthursilva.criacionais.builder.cars;

import com.devarthursilva.criacionais.builder.component.Engine;
import com.devarthursilva.criacionais.builder.component.GPSNavigator;
import com.devarthursilva.criacionais.builder.component.Transmission;
import com.devarthursilva.criacionais.builder.component.TripComputer;

public class Car {

	private CarType carType;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	private double fuel = 0;
	
	
	
	public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		super();
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		if (this.tripComputer != null) {
			this.tripComputer.setCar(this);
		}
		this.gpsNavigator = gpsNavigator;
	}

	public CarType getCarType() {
		return carType;
	}
	
	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}

	public double getFuel() {
		return fuel;
	}
	
}
