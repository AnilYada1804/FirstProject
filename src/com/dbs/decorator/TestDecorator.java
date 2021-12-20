package com.dbs.decorator;

public class TestDecorator {
	public static void main(String[] args) {
		Car car = new SportsDecorator(new BasicCar());
		car.assembele();
		System.out.println("-----------");
		Car car1 = new LuxoruDecorator(new SportsDecorator(new BasicCar()));
		car1.assembele();
	}
}
