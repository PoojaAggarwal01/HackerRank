package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class TaumAndBday {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long cost;
			long b = in.nextLong();
			long w = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();

			if (z < x && (b * y) + (b * z) < (b * x)) {
				cost = (b * y) + (w * y) + (b * z);
			} else if (z < y && (w * x) + (w * z) < (w * y)) {
				cost = (b * x) + (w * x) + (w * z);
			} else {
				cost = (b * x) + (w * y);
			}
			System.out.println(cost);
		}
	}
}
