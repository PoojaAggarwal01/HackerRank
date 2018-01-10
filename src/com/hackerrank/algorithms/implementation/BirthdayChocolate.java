package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BirthdayChocolate {
	static int solve(int n, int[] s, int d, int m) {
		int count = 0;

		if (n < m) {
			return 0;
		}

		else {

			for (int i = 0; i < s.length; i++) {
				int sum = 0;
				int j = 0;
				while (j < m && i + j < n) {
					sum = sum + s[i + j];
					j++;
				}
				if (sum == d) {
					count++;

				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = solve(n, s, d, m);
		System.out.println(result);
	}
}
