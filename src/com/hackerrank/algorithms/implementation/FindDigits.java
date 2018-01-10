package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int temp = 0;
			int count = 0;
			int num = n;
			while (num != 0) {
				temp = num % 10;
				num = num / 10;
				if (temp == 0) {

					continue;
				}
				if (n % temp == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
