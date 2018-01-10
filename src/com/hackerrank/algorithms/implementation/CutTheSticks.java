package com.hackerrank.algorithms.implementation;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CutTheSticks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int count = 0;
		Map<Integer, Integer> countMap = new TreeMap<>();
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (countMap.containsKey(arr[arr_i])) {
				count = countMap.get(arr[arr_i]);
			} else {
				count = 0;
			}
			count++;
			countMap.put(arr[arr_i], count);
		}
		int stickCount = n;
		for (Map.Entry m : countMap.entrySet()) {

			System.out.println(n);
			n = n - (int) m.getValue();

		}

	}
}
