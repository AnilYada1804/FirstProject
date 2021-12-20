package com.dbs.java8;

public interface MyInterface2 {

	default void defaultMethod2() {
		System.out.println("MyInteface default method:");
	}

	static void staticMethod2() {
		System.out.println("static method inside MyInteface2");
	}

	public abstract void abstractMethod2(String str);
}
