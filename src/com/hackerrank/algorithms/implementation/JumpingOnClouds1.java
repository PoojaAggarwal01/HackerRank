package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class JumpingOnClouds1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		int e = 100;
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		for (int i = 0; i < n; i = i + k) {
			if (c[i] == 1) {
				e -= 2;
			}
			e--;
		}
		System.out.println(e);
	}
}
