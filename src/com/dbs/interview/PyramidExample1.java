package com.dbs.interview;

import java.util.Scanner;

public class PyramidExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rows want to print: ");
		int rows = sc.nextInt();
		sc.close();

		for (int i = 1; i <= rows; i++) {
			int numberOfWhiteSpaces = rows - i;
			printFormat("*", numberOfWhiteSpaces);
//			printFormat(i + " ", i);
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

	private static void printFormat(String format, int times) {
		for (int columns = 1; columns <=times; columns++) {
			System.out.print(format);
		}
	}

}
