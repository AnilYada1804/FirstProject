package com.dbs.jp.interview;

public class IsListSorted {
	public static void main(String[] args) {
		Integer arr[] = { 3, 5, 6, 9};
		Boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				flag = true;
			} else {
				flag = false;
			}
		}
		System.out.println("flag: " + flag);
	}

}
