package com.interview.jp;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumber {
	public static void main(String[] args) {
		int arry[] = { 2, 1,3, 4,6 };
		findMissingNumber(arry,6);
		System.out.println("-----------------");
		
		printMissingNumber(arry, 6);
	}

	private static void findMissingNumber(int[] arry, int count) {
		System.out.println((4 + 1) / 2);// 2
		System.out.println(4 * (4 + 1) / 2);// (4*4+4*1)/2
//		int expectedCount = 4 * (4 + 1) / 2;
		int expectedCount = count*(count+1)/2;
		int actualSum = 0;
		for (int num : arry) {
			actualSum += num;
		}
		int missingNumber = expectedCount - actualSum;
		System.out.println("test:x"+missingNumber);
	}

	/**
	 * A general method to find missing values from an integer array in Java. This
	 * method will work even if array has more than one missing element.
	 */
	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count -numbers.length;
		BitSet bitSet = new BitSet(count);
		for(int num: numbers) {
			bitSet.set(num -1);
		}
		System.out.printf("Missing numbers in integer arry %s, with total numbers %d is %n", Arrays.toString(numbers), count);
		int lastMissingIndex =  0;
		for(int i=0; i<missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
		
		BitSet bit = new BitSet(count);
		for(int num : numbers) {
			bit.set(num -1);
		}
		int lastMisNumber =0;
		for( int i =0; i< missingCount; i++) {
			lastMisNumber = bit.nextClearBit(lastMisNumber);
			System.out.println(++lastMisNumber);
		}
		int expCount = count* (count +1)/2;

	}

}
