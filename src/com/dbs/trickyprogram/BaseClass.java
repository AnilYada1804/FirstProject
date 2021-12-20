package com.dbs.trickyprogram;

public class BaseClass {

	public A m1() {
		System.out.println("Inside Baseclass");
		return new A();
	}

	public static void main(String[] args) {
		BaseClass baseClass = new SubClass();
		baseClass.m1();
	}

}

class SubClass extends BaseClass {
	public B m1() {
		System.out.println("Inside subclass");
		return new B();
	}
}

class A {

}

class B extends A {

}
