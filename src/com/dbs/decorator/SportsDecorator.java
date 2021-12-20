package com.dbs.decorator;

public class SportsDecorator extends CarDecorator {

	SportsDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assembele() {
		System.out.print("Adding features for sportscar");
	}

}
