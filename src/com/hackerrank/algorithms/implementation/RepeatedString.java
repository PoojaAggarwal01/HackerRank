package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();
		s = s.toLowerCase();
		int counta = 0;
		long count = 0;
		if (s.length() == 1) {
			if (!s.contains("a")) {
				System.out.println(0);
			} else {
				System.out.println(n);
			}
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a') {
					counta++;
				}
			}
			count = (n / s.length()) * counta;
			long m = n % s.length();
			while (m > 0) {
				if (s.charAt((int) (m - 1)) == 'a') {
					count++;

				}
				m--;
			}
			System.out.println(count);
		}

	}
}
