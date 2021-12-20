package com.dbs.algorithm;

public class SwapNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// int a = a+b; //30
//		int b = a-b;  //30-20 = 10
//		int a = a -b ; //30 -10 =20

		int temp;
		temp = b;
		b = a;
		a = temp;
		System.out.println("a = " + a + "b= " + b);

	}

}
