package com.dbs.coreJava;

public class Fibnoci {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 1;
		for (int i = 0; i < 10; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
		System.out.println("----------");
		System.out.println(factorial(5));
	}

	private static int factorial(int i) {

		if (i == 0) {
			return 1;
		}
		return i * factorial(i - 1);

	}

}
