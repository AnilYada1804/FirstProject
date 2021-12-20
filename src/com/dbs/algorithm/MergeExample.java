package com.dbs.algorithm;

public class MergeExample {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 3 };
		int mergeSort[] = mergeSort(arr, 0, arr.length - 1);
		for (int num : mergeSort) {
			System.out.print(num);
		}
	}

	public static int[] mergeSort(int arr[], int lo, int hi) {
		if (lo == hi) {
			int br[] = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = lo + hi / 2;

		int fh[] = mergeSort(arr, lo, mid);
		int sh[] = mergeSort(arr, mid + 1, hi);

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
