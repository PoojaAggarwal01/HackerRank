package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class FairRations {

	static int fairRations(int[] B) {
		int countOdd = 0;
		for (int i = 0; i < B.length; i++) {
			if (B[i] % 2 != 0 && i < B.length - 1) {
				B[i]++;
				B[i + 1]++;
				countOdd += 2;
			}

		}

		for (int i = 0; i < B.length; i++) {
			if (B[i] % 2 != 0) {
				return -1;
			}

		}
		return countOdd;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] B = new int[N];
		for (int B_i = 0; B_i < N; B_i++) {
			B[B_i] = in.nextInt();
		}
		int result = fairRations(B);
		if (result == -1) {
			System.out.println("NO");
		} else {
			System.out.println(result);
		}
		in.close();
	}
}
