package com.dbs.interview;

import java.util.Arrays;
import java.util.List;

public class IsGivenArraySortted {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3 };
		System.out.println(sortedArray(arr));
		List<Integer> list = Arrays.asList(1, 2, 3);
		System.out.println(isSortedList(list));
	}

	private static Boolean isSortedList(List<Integer> list) {
		int size = list.size();
		Boolean flag = false;
		for (int i = 0; i < size - 1; i++) {
			System.out.println(list.get(i) + "--" + list.get(i + 1));
			if (list.get(i) < list.get(i + 1)) {
				flag = true;
			}
		}
		return flag;
	}

	private static boolean sortedArray(Integer[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				flag = true;
			} else {
				return flag = false;
			}
		}
		return flag;
	}

}
