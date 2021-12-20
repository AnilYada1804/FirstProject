package com.dbs.designpattern;

public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String cpu) {
		if("PC".equals(type)) {
			return new PC(ram, cpu);
		}else if("Server".equals(type)){
			return new Server(ram, cpu);
		}
		return null;
	}

}
