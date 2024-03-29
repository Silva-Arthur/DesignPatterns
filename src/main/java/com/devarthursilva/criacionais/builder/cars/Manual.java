package com.devarthursilva.criacionais.builder.cars;

import com.devarthursilva.criacionais.builder.component.Engine;
import com.devarthursilva.criacionais.builder.component.GPSNavigator;
import com.devarthursilva.criacionais.builder.component.Transmission;
import com.devarthursilva.criacionais.builder.component.TripComputer;

public class Manual {
	
	private CarType carType;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	
	public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		super();
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
	}
	
	public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
