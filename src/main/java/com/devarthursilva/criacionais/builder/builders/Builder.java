package com.devarthursilva.criacionais.builder.builders;

import com.devarthursilva.criacionais.builder.cars.CarType;
import com.devarthursilva.criacionais.builder.component.Engine;
import com.devarthursilva.criacionais.builder.component.GPSNavigator;
import com.devarthursilva.criacionais.builder.component.Transmission;
import com.devarthursilva.criacionais.builder.component.TripComputer;

public interface Builder {
	void setCarType(CarType type);
	void setSeats(int seats);
	void setEngine(Engine engine);
	void setTransmission(Transmission transmission);
	void setTripComputer(TripComputer tripComputer);
	void setGPSNavigator(GPSNavigator gpsNavigator);
}
