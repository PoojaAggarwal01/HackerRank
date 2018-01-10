package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PickingNumbers {
	static int pickingNumbers(int[] a) {
		Map<Integer, Integer> countMap = new HashMap<>();
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			if (!countMap.containsKey(a[i])) {
				countMap.put(a[i], 1);

			} else {
				countMap.put(a[i], countMap.get(a[i]) + 1);
			}
		}
		for (int i = 0; i < a.length; i++) {

			if (countMap.containsKey(a[i] - 1) && countMap.containsKey(a[i] + 1)) {
				if (countMap.get(a[i] - 1) > countMap.get(a[i] + 1)
						&& countMap.get(a[i]) + countMap.get(a[i] - 1) >= max) {
					max = countMap.get(a[i]) + countMap.get(a[i] - 1);
				} else if (countMap.get(a[i]) + countMap.get(a[i] + 1) >= max) {
					max = countMap.get(a[i]) + countMap.get(a[i] + 1);
				}
			} else if (countMap.containsKey(a[i] - 1) && !countMap.containsKey(a[i] + 1)
					&& countMap.get(a[i]) + countMap.get(a[i] - 1) > max) {
				max = countMap.get(a[i]) + countMap.get(a[i] - 1);
			} else if (!countMap.containsKey(a[i] - 1) && countMap.containsKey(a[i] + 1)
					&& countMap.get(a[i]) + countMap.get(a[i] + 1) > max) {
				max = countMap.get(a[i]) + countMap.get(a[i] + 1);
			} else if (!countMap.containsKey(a[i] - 1) && !countMap.containsKey(a[i] + 1) && countMap.get(a[i]) > max) {
				max = countMap.get(a[i]);
			}

		}

		return max;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int result = pickingNumbers(a);
		System.out.println(result);
		in.close();
	}
}
