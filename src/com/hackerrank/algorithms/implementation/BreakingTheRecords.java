package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {
	static int[] getRecord(int[] s) {
		int[] ar = new int[2];

		int min = s[0];
		int max = s[0];
		for (int i = 1; i < s.length; i++) {
			if (s[i] < min) {
				ar[1]++;
				min = s[i];
			} else if (s[i] > max) {
				ar[0]++;
				max = s[i];
			}
		}
		return ar;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int[] result = getRecord(s);
		String separator = "", delimiter = " ";
		for (Integer val : result) {
			System.out.print(separator + val);
			separator = delimiter;
		}
		System.out.println("");
	}
}
