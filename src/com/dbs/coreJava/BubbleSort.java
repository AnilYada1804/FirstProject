package com.dbs.coreJava;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 2, 1, 3 };
		for (int i = 0; i < array.length; i++) {
			System.out.println("i: " + i);
			for (int j = array.length - 1; j > i; j--) {
				System.out.println("j: " + j);
				if (array[j] < array[j - 1]) {
					swap(array, j, j - 1);
				}
			}
		}
//		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString((array)));
		testBubbleSort();
	}
	
	private static void testBubbleSort() {
		int[] array = { 2, 1, 3 };
		int size = array.length;
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-i-1; j++) {
				if(array[j] >array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("----");
		System.out.println(Arrays.toString((array)));
	}

	private static void swap(int[] array, int from, int to) {
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}

	public static int[] mergeSorted(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					swapArray(array, j, j - 1);
				}
			}

		}
		return array;
	}

	private static void swapArray(int[] array, int from, int to) {
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}

}
