package com.dbs.interview;

import java.util.Scanner;

public class PyramidExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the rows to print");
		int rows = sc.nextInt();
		sc.close();
		System.out.println("printing pattern 1\n");
		printPattern(rows);
	}

	// utility function to print string given times
	private static void printString(String s, int times) {
		for (int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}

	private static void printPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;

			// print leading white spaces
			printString("*", numberOfWhiteSpaces);

			// print numbers
			printString(i + " ", i);

			// move to next line
			System.out.println("");
		}
	}

}

//***
//**1 
//*2 2 
