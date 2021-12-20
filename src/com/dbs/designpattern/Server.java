package com.dbs.designpattern;

public class Server extends Computer{
	private String ram;
	private String cpu;
	
	Server(String ram, String cpu){
		this.ram = ram;
		this.cpu =cpu;
	}

	@Override
	public String getRam() {
		return this.ram;
	}

	@Override
	public String getCpu() {
		return this.cpu;
	}
	
	@Override
	public String toString() {
		return  "ram "+ this.ram  +" - cpu "+this.cpu;
	}

}
