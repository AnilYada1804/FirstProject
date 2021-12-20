package com.dbs.interview;

public class IsPallindromeString {
	public static void main(String[] args) {
		String str = "abccba";
		System.out.println(isPallindromeString(str));
	}

	private static boolean isPallindromeString(String str) {
		boolean flag = false;
		if (str != null) {
			System.out.println(str.length() / 2);
			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
					return flag = false;
				}
			}
			flag = true;
		}
		return flag;
	}
}
