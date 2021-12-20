package com.dbs.algorithm;

public class MergeSortExample {
	public static void main(String[] args) {
		int arr[] = { 20, 10, 2, 1 };
		int mergeSort[] = mergeSort(arr, 0, arr.length - 1);
		for (int number : mergeSort) {
			System.out.print(number + " ");
		}

	}

	public static int[] mergeSort(int arr[], int lo, int hi) {
		if (lo == hi) {
			int br[] = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		int fh[] = mergeSort(arr, lo, mid);
		int sh[] = mergeSort(arr, mid + 1, hi);
		int sorted[] = sortTwoSubLists(fh, sh);

		return sorted;
	}

	private static int[] sortTwoSubLists(int[] fh, int[] sh) {
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
