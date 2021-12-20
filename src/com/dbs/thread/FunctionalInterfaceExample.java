package com.dbs.thread;

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		FunctionalInterfaceExample fc = new FunctionalInterfaceExample();
		fc.printForm(() -> System.out.println("-printForm-"));
	}
	public void printForm(FunctionalInterface fc) {
		fc.print();
		fc.printForm();
	}

}

interface FunctionalInterface {

	public void print();
	
	default void printForm() {
		System.out.println("printForm");
	}
	default void printForm1() {
		System.out.println("printForm");
	}
}