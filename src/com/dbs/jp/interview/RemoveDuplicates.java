package com.dbs.jp.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int array[] = { 2, 9, 2, 5, 1, 5, 1 };
		int size = removeDuplicates(array, array.length);
		for (int i = 0; i < size; i++)
		System.out.println(array[i]);
//			removeDuplicate();
		removeDuplicatesForUnsortedArray();
	}

	private static int removeDuplicates(int[] array, int length) {
		System.out.println("-----");
		List<int[]> num = Arrays.asList(array).stream().distinct().collect(Collectors.toList());
		System.out.println("num: "+ num);
		int temp[] = new int[length];
		Arrays.sort(array);
		int j =0;
		for(int i=0; i<length-1; i++) {
			if(array[i] != array[i+1]) {
				temp[j++] = array[i];
			}
		}
		temp[j++] = array[length-1];
		for(int i=0; i<j; i++) {
			array[i] = temp[i];
		}
		return j;
	}

	private static void removeDuplicatesForUnsortedArray() {
		int arr[] = { 3, 2, 1, 1, 3, 5 };
		Set set = new TreeSet<>();
		for (int num: arr) {
			set.add(num);
		}
		System.out.println("-------------------");
		for (Object object : set) {
			System.out.println(object);
		}

	}

	private static void removeDuplicate() {
		int a[] = { 5, 2, 2, 5, 1, 2,8,9,8 };
		int n = a.length;

		// m will have the maximum element in the array.
		int m = 0;

		for (int i = 0; i < n; i++) {
			m = Math.max(m, a[i]);
		}

		// creating the frequency array
		int[] f = new int[m + 1];

		// initializing the f[] with 0
		for (int i = 0; i < m + 1; i++) {
			f[i] = 0;
		}

		// incrementing the value at a[i]th index
		// in the frequency array
		for (int i = 0; i < n; i++) {
			f[a[i]]++;
		}

		for (int i = 0; i < m + 1; i++) {

			// if the frequency of the particular element
			// is greater than 0, then print it once
			if (f[i] > 0) {
				System.out.print(i + " ");
			}
		}
	}

}
