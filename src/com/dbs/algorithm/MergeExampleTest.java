package com.dbs.algorithm;

public class MergeExampleTest {
	public static void main(String[] args) {
		int array[] = { 2, 8, 1, 4, 5, 6 };
		int sotedArray[] = mergeSort(array, 0, array.length - 1);
		for (int num : sotedArray) {
			System.out.print(num + " ");
		}
	}

	private static int[] mergeSort(int[] array, int lo, int hi) {
		if (lo == hi) {
			int br[] = new int[1];
			br[0] = array[lo];
			return br;
		}

		int mid = (lo + hi) / 2;
		int fh[] = mergeSort(array, lo, mid);
		int sh[] = mergeSort(array, mid + 1, hi);

		int sortedArray[] = mergeSortedArray(fh, sh);

		return sortedArray;
	}

	private static int[] mergeSortedArray(int[] fh, int[] sh) {
		int sorted[] = new int[fh.length + sh.length];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < fh.length && j < sh.length) {
			if (fh[i] < sh[j]) {
				sorted[k] = fh[i];
				i++;
				k++;
			} else {
				sorted[k] = sh[j];
				j++;
				k++;
			}
		}

		if (i == fh.length) {
			while (j < sh.length) {
				sorted[k] = sh[j];
				j++;
				k++;
			}
		}

		if (j == sh.length) {
			while (i < fh.length) {
				sorted[k] = fh[i];
				i++;
				k++;
			}
		}

		return sorted;
	}

}
