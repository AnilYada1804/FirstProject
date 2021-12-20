package com.dbs.fizbuz;

public class FizbuzzExample {

	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {
			System.out.print(fizzBuzz(i)+" ");
		}
	}

	public static String fizzBuzz(int number) {
		if (number % 15 == 0) {
			return "fizzbuzz";
		} else if (number % 5 == 0) {
			return "buzz";
		} else if (number % 3 == 0) {
			return "fizz";
		}
		return String.valueOf(number);
	}

}
