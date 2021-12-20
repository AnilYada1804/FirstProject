package com.dbs.coreJava;

public class CompositionExample {

	// Composition
	SuperClass sClass = null;

	public CompositionExample(SuperClass sClass) {
		this.sClass = sClass;
	}
	
	public void test() {
		sClass.doSomething();
	}
	
	public static void main(String[] args) {
		CompositionExample a = new CompositionExample(new A());
		CompositionExample b = new CompositionExample(new B());
		a.test();
		b.test();
		
	}

}
