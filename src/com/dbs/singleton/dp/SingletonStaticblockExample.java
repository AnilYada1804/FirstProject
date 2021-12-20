package com.dbs.singleton.dp;

public class SingletonStaticblockExample {
	private SingletonStaticblockExample() {

	}

	private static final SingletonStaticblockExample instance;

	static {
		try {
			instance = new SingletonStaticblockExample();
		} catch (Exception e) {
			throw new RuntimeException("Expection occured");
		}
	}

	public static SingletonStaticblockExample getInstance() {
		return instance;
	}

}
