package com.dbs.test;

public class TestDominos {
	public static String solution(int[] A) {
		int DominoLength = 2;
		int arrayLength = A.length;

		int offset = 0;
		int currentRow = 1;
		boolean result = false;
		while (true) {
			int currentRowLength = currentRow * DominoLength;
			if (offset + currentRowLength >= arrayLength) {
				break;
			}
			result = CheckValuesOnRowAgainstRowBelow(A, offset, currentRowLength);
			offset += currentRowLength;
			currentRow++;
		}
		return result ? "YES" : "NO";
	}

	public static boolean CheckValuesOnRowAgainstRowBelow(int[] values, int startOfCurrentRow, int currentRowLength) {
		int startOfNextRow = startOfCurrentRow + currentRowLength;
		int comparablePointOnNextRow = startOfNextRow + 1;
		for (int i = 0; i < currentRowLength; i++) {
			if (values[startOfCurrentRow + i] != values[comparablePointOnNextRow + i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String arg[]) {
		int[] values = new int[] { 4, 3, 3, 4, 1, 2, 2, 3, 6, 5, 4, 5 };
		System.out.println(solution(values));
	}
}
