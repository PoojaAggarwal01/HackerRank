package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DesignerPdfViewer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		char[] wordChars = word.toCharArray();
		for (int i = 0; i < wordChars.length; i++) {
			int j = wordChars[i] - 97;
			if (h[j] > max) {
				max = h[j];
			}
		}
		System.out.println((max * word.length()));
	}
}
