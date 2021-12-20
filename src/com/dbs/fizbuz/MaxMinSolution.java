package com.dbs.fizbuz;

import java.util.Arrays;

public class MaxMinSolution {
	public static void main(String[] args)  {
		int[] list = {1,1,1};
		int N = 3;
		int K = 2;


		int unfairness = Integer.MAX_VALUE;
		System.out.println(maxMin(2, list));

		Arrays.sort(list);// Sorts the list ascending
		for (int i = 0; i < N - K + 1; i++)
			unfairness = Math.min(list[i + K - 1] - list[i], unfairness);// Keeps a running min of the beginning and end
																			// of subarrays

		System.out.println(unfairness);
	}
	
	 static int maxMin(int k, int[] arr) {
	        Arrays.sort(arr);
	        
	        int min = Integer.MAX_VALUE;
	        for(int i = 0; i <= arr.length - k; i++) 
	            min = Math.min(min, arr[k + i - 1] - arr[i]);
	        return min;
	    }

}
