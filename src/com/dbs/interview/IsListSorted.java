package com.dbs.interview;

import java.util.Arrays;
import java.util.List;

public class IsListSorted {
	public static void main(String[] args) {
		isLisSorted();
		List<Integer> numbers = Arrays.asList(0, 1, 3, 4, 6, 8);
		for (int i = 0; i < numbers.size(); i++) {
			if (isSorted(numbers, i)) {
				System.out.println("Given list is sorted");
				break;
			}
		}
	}

	private static boolean isSorted(List<Integer> numbers, Integer index) {
		boolean flag = false;

		if (numbers.get(index) < numbers.get(index) + 1) {
			System.out.println("asc");
			if (index == numbers.size()) {
				flag = true;
			}
		} else {
			flag = false;
			System.out.println("not sorted");
		}
		return flag;
	}

	public static void isLisSorted() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		boolean flag = true;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) < list.get(i + 1)) {
				flag = true;
			} else {
				flag = false;
			}
		}
		System.out.println(flag);
	}

}
