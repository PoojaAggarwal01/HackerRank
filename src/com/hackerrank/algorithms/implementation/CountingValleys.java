package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CountingValleys {
	public static void main(String[] args) {
		int count = 0, sea = 0, prev = 0, next = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str;
		str = sc.next();
		for (int i = 0; i < n; i++) {

			prev = sea;
			if (str.charAt(i) == 'U' || str.charAt(i) == 'u') {
				sea += 1;
			} else if ((str.charAt(i) == 'D' || str.charAt(i) == 'd')) {

				sea -= 1;
			}
			if (prev > sea) {
				flag = true;
			}

			else {
				flag = false;
			}
			if (!flag && sea == 0) {
				count++;
			}
		}
		System.out.println(count);

	}
}
