package com.test;

public class SingletonTest {

	private SingletonTest() {
		// TODO Auto-generated constructor stub
	}

	private static SingletonTest instance;

	public static SingletonTest getInstance() {
		if (instance == null) {
			synchronized (SingletonTest.class) {
				if (instance == null) {
					instance = new SingletonTest();
				}
			}
		}

		return instance;
	}

}
