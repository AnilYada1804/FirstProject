package com.dbs.java8;

public class Java8Interface implements MyInterface, MyInterface2 {
	public static void main(String[] args) {
		Java8Interface test = new Java8Interface();
		test.abstractMethod2("Hello");
		test.defaultMethod2();
		MyInterface.staticMethod1();
		MyInterface2.staticMethod2();
	}

	@Override
	public void abstractMethod2(String str) {
		System.out.println(str);
	}

	@Override
	public void defaultMethod2() {
		// TODO Auto-generated method stub
		System.out.println("----**----");
		MyInterface.super.defaultMethod2();
		MyInterface2.super.defaultMethod2();
		System.out.println("------------j");
		System.out.println("test");
	}

}
