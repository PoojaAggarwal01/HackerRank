package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BeautifulTriplets {
	static int beautifulTriplets(int d, int[] arr) {
		int count = 0;
		int current;

		for (int i = 0; i < arr.length; i++) {
			current = arr[i];
			int c = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (current + d == arr[j]) {
					current = arr[j];
					c++;
				}
				if (c == 2) {
					count++;
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = beautifulTriplets(d, arr);
		System.out.println(result);
		in.close();
	}
}
