package com.dbs.designpattern;

public class FactoryClientProgram {
	public static void main(String[] args) {
		Computer pcComputer = ComputerFactory.getComputer("PC", "2GB", "1GH");
		Computer serverComputer = ComputerFactory.getComputer("Server", "3GB", "1GH");
		System.out.println("PC Computer: " + pcComputer);
		System.out.println("Server computer: " + serverComputer);
	}

}
