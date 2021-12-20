package com.dbs.singleton.dp;

public class DoubleCheckedSingleton {
	private DoubleCheckedSingleton() {

	}

	private static DoubleCheckedSingleton instance;

	// Double checked locking singleton
	public static DoubleCheckedSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedSingleton();
				}
			}
		}
		return instance;
	}

}

class DcheckedSingleton{
	private DcheckedSingleton() {
		
	}
	private static DcheckedSingleton instance;
	
	public static DcheckedSingleton getInstance() {
		if(instance == null) {
			synchronized (DcheckedSingleton.class) {
				if(instance == null) {
					instance = new DcheckedSingleton();
				}
				
			}
		}
		return instance;
	}
	
}
