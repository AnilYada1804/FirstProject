package com.dbs.algorithm;

import java.util.Scanner;

public class Array2DExample {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter Element");
				arr[i][j] = sc.nextInt();
				System.out.println();
			}
		}
		System.out.println("Printing Elements...");
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "\t");
			}
		}

//		Scanner sc = new Scanner(System.in);
//		int arr[][] = new int[2][3];
//		System.out.println("arry size before :"+arr.length);
//		storeElementsInArray(sc, arr);
//		retriveElementsFromArray(arr);
	}

	private static void retriveElementsFromArray(int[][] arr) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j]);
			}
		}
	}

	private static void storeElementsInArray(Scanner sc, int[][] arr) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				int num = sc.nextInt();
				arr[i][j] = num;
			}
		}
		System.out.println("arry size:" + arr.length);
	}

}
