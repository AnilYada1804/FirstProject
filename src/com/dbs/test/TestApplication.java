package com.dbs.test;

import java.util.Arrays;

public class TestApplication {
	public static void main(String[] args) {
		int intArray[] = new int[] { 1, 3, 6, 4, 1, 2 };
		Arrays.sort(intArray);
		int mininum = 1;

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == mininum) {
				mininum++;
			}
		}
		System.out.print("result:" + mininum);

	}
}
