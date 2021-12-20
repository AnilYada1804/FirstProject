package com.dbs.fizbuz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzzTest {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Result.fizzBuzz(n);

		bufferedReader.close();
	}
}

class Result {

	/*
	 * Complete the 'fizzBuzz' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void fizzBuzz(int n) {
		// Write your code here
		String result;
		if (n % 15 == 0) {
			result = "FizzBuzz";
		} else if (n % 3 == 0) {
			result = "Fizz";
		} else if (n % 5 == 0) {
			result = "Buzz";
		}else {
			result = String.valueOf(n);
		}
		System.out.println(result);

	}

}
