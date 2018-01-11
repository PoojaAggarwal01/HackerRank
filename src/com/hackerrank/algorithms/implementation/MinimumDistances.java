package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumDistances {
	static int minimumDistances(int[] a) {
		Map<Integer, Integer[]> distMap = new HashMap<Integer, Integer[]>();
		boolean duplicate = false;
		for (int i = 0; i < a.length; i++) {
			if (!distMap.containsKey(a[i])) {
				distMap.put(a[i], new Integer[] { i, 0 });
			} else if (distMap.get(a[i])[1] == 0) {
				duplicate = true;
				distMap.put(a[i], new Integer[] { distMap.get(a[i])[0], i });
			} else if (distMap.get(a[i])[1] - distMap.get(a[i])[0] > i - distMap.get(a[i])[1]) {
				duplicate = true;
				distMap.put(a[i], new Integer[] { distMap.get(a[i])[1], i });
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {

			if (duplicate && distMap.get(a[i])[1] - distMap.get(a[i])[0] < min && distMap.get(a[i])[1] != 0) {
				min = distMap.get(a[i])[1] - distMap.get(a[i])[0];
			}

		}
		if (!duplicate) {
			return -1;
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int result = minimumDistances(a);
		System.out.println(result);
		in.close();
	}
}
