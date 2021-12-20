package com.dbs.interview;

public class PyramidExample3 {
	public static void main(String[] args) {
		printPattern5(3);
	}

	private static void printString(String format, int times) {
		for (int columns = 1; columns <= times; columns++) {
			System.out.print(format);
		}
	}

	private static void printPattern5(int rows) {
		// for loop for the rows
		for (int i = rows; i >= 1; i--) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;

			// print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			// print character
			printString("* ", i);

			// move to next line
			System.out.println("");
		}
	}

}

//* * * 
//* * 
// * 

