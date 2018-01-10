package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class jumpingOnClouds2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}

		int i = 0, count = 0;
		while (i < n - 1) {
			if (n < 2) {
				i++;
			} else if (i < n - 2 && c[i + 2] == 1) {
				i++;
			} else {
				i = i + 2;
			}
			count++;
		}
		System.out.println(count);
	}
}
