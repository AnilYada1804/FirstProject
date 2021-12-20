package com.dbs.singleton.dp;

public class SingletonEarlyLoadExample {
	// create private constructor so that will restrict instantiation of class this
	// from outsdie class
	private SingletonEarlyLoadExample() {
	}

	private static final SingletonEarlyLoadExample instance = new SingletonEarlyLoadExample();

	public static SingletonEarlyLoadExample getInstance() {
		return instance;
	}

}
