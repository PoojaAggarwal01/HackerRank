package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {
	static int migratoryBirds(int n, int[] ar) {
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (!countMap.containsKey(ar[i])) {
				countMap.put(ar[i], 1);
			} else {
				countMap.put(ar[i], countMap.get(ar[i]) + 1);
			}
		}
		int i = 1;
		int max = 0;
		int j = 0;
		while (i <= 5) {
			if (countMap.containsKey(i)) {
				if (countMap.get(i) > max) {
					max = countMap.get(i);
					j = i;

				}
			}
			i++;
		}
		return j;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}
}
