package com.dbs.interview;

public class PyramidExample2 {
	public static void main(String[] args) {
		printPattern4(3);
	}
	
	private static void printString(String format, int times) {
		for (int columns = 1; columns <=times; columns++) {
			System.out.print(format);
		}
	}

	private static void printPattern4(int rows) {
		// for loop for the rows
		for (int i = rows; i >= 1; i--) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows-i;

			//print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			//print numbers
			for(int x=1; x<=i; x++) {
				System.out.print(x+" ");
			}

			//move to next line
			System.out.println("");
		}
	}
}

//1 2 3 
//1 2 
// 1 
