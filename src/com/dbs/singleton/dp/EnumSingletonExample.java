package com.dbs.singleton.dp;

public enum EnumSingletonExample {
	INSTANCE;
	public static void doSomething() {
		
	}

	static EnumSingletonExample INSTANCE() {
		// TODO Auto-generated method stub
		return INSTANCE;
	}

}

enum Test{
	instance;
	public static void doSomething() {
		
	}
	static Test getInstance() {
		return instance;
	}
}