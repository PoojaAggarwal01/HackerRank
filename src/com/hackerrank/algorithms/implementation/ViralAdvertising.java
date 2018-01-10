package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ViralAdvertising {
	public static void main(String[] args) {
		int m = 5, sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sum = sum + (m / 2);
		for (int i = 2; i <= n; i++) {
			m = (m / 2) * 3;
			sum = sum + (m / 2);
		}
		System.out.println(sum);

	}
}
