package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BeautifulDaysMovies {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		while (i <= j) {
			int num = i;
			int rev = 0;
			while (num != 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;
			}
			if ((Math.abs(rev - i)) % k == 0 || rev == i) {
				count++;
			}
			i++;
		}
		System.out.println(count);

	}
}
