package com.dbs.decorator;

public class CarDecorator implements Car {
	protected Car car;
	
	CarDecorator(Car car){
		this.car =car;
	}

	@Override
	public void assembele() {
		this.car.assembele();
	}

}
