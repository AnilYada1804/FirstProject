package com.dbs.test;

public class Test1 {
	public static String NoThreeConsecutiveLetters(int A, int B) {

		StringBuilder value = new StringBuilder();
		while (A > 0 || B > 0) {
			boolean flag = false;
			int length = value.length();
			if (length >= 2 && value.charAt(length - 1) == value.charAt(length - 2)) {
				if (value.charAt(length - 1) == 'b')
					flag = true;
			} else {
				if (A >= B)
					flag = true;
			}

			if (flag) {
				A--;
				value.append('a');
			} else {
				B--;
				value.append('b');
			}
		}
		return value.toString();
	}

	public static void main(String[] args) {
		int A = 1, B = 4;
		System.out.println(NoThreeConsecutiveLetters(A, B));
	}
}
