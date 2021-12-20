package com.dbs.jp.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		Integer array[] = { 2, 31, 1, 4, 5, 3, 6, 8 };
		findSecondHighestNumber(array);
		List<Integer> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println("Second highest: " + list.get(list.size() - 2));

	}

	private static void findSecondHighestNumber(Integer[] array) {
		int higestNumber = array[0];
		int secondHigestNumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > higestNumber) {
				secondHigestNumber = higestNumber;
				higestNumber = array[i];
			} else if (array[i] > secondHigestNumber) {
				secondHigestNumber = array[i];
			}
		}
		System.out.println("higestNumber: " + higestNumber);
		System.out.println("seconHighest: " + secondHigestNumber);
	}
}
