package com.dbs.singleton.dp;

public class ThreadSafeSingleton {
	private ThreadSafeSingleton() {

	}

	private static ThreadSafeSingleton instance;

	public static synchronized ThreadSafeSingleton getInstnce() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

}
