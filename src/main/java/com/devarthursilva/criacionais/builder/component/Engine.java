package com.devarthursilva.criacionais.builder.component;

public class Engine {

	private double volume;
	private double mileage;
	private boolean started;
	
	public Engine() {
	}

	public Engine(double volume, double mileage) {
		super();
		this.volume = volume;
		this.mileage = mileage;
	}
	
	public void on() {
		started = true;
	}
	
	public void off() {
		started = false;
	}
	
	public void go(double mileage) {
		if (started) {
			this.mileage += mileage;
		} else {
			System.err.println("cannot go(), you must start engine frist!");
		}
	}

	public double getVolume() {
		return volume;
	}

	public double getMileage() {
		return mileage;
	}

	public boolean isStarted() {
		return started;
	}
	
}
