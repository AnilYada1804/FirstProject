package com.dbs.interview;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondHighest {
	public static void main(String[] args) {
		int arr[] = { 0, 5, 1 };
		int higest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > higest) {
				secondHighest = higest;
				higest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}
		}
		System.err.println("highest:" + higest);
		System.err.println("secondHighest:" + secondHighest);
		//sorting
		Arrays.sort(arr);
		System.out.println("sorted Array: "+Arrays.toString(arr));
		System.out.println("second highest: "+(arr.length -2));
		
		Arrays.asList(arr).stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	}

}
