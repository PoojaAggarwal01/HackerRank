package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class TheHurdleRace {
	public static void main(String[] args) {
		int max = 0;
		int t = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
			if (height[height_i] > max) {
				max = height[height_i];
			}
		}

		if (max > k) {
			t = max - k;
		}
		System.out.println(t);
	}
}
