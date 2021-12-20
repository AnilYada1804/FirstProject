package com.dbs.decorator;

public class LuxoruDecorator extends CarDecorator {

	LuxoruDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void assembele() {
		super.assembele();
		System.out.print("Adding features of Luxury class ");
	}

}
