package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
	static int sockMerchant(int n, int[] ar) {
		int result = 0;
		int count = 0;
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int ar_i = 0; ar_i < n; ar_i++) {

			if (countMap.containsKey(ar[ar_i])) {
				count = countMap.get(ar[ar_i]);
				count++;
			} else {
				count = 0;
			}
			countMap.put(ar[ar_i], count);
		}
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			result = result + (entry.getValue() + 1) / 2;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}
