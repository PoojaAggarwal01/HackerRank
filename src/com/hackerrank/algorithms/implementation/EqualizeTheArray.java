package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class EqualizeTheArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		int max = 0;
		int count[] = new int[101];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
			count[c[c_i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
			}
		}
		System.out.println(n - max);
	}
}
