package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HappyLadyBug {

	public static String happyBug(String b) {
		boolean isHappy = false;
		int countUnderScore = 0;
		Map<Character, Integer> countMap = new HashMap<>();
		for (int i = 0; i < b.length(); i++) {

			if (!countMap.containsKey(b.charAt(i))) {
				countMap.put(b.charAt(i), 1);
			} else {
				countMap.put(b.charAt(i), countMap.get(b.charAt(i)) + 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getKey() == '_') {
				if (entry.getValue() == b.length()) {
					return "YES";
				} else {
					countUnderScore = entry.getValue();
				}

			} else if (entry.getValue() == 1 && entry.getKey() != '_') {
				return "NO";

			}

			else {
				isHappy = true;
			}
		}

		if (countUnderScore == 0) {
			for (int i = 0; i < b.length() - 2; i++) {
				if (b.charAt(i) != b.charAt(i + 1) && b.charAt(i + 1) != b.charAt(i + 2)) {
					return "NO";
				} else {
					isHappy = true;
				}
			}
		}

		if (isHappy) {
			return "YES";
		} else {
			return "NO";
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();

		for (int a0 = 0; a0 < Q; a0++) {

			int n = in.nextInt();
			String b = in.next();

			System.out.println(happyBug(b));

		}
	}
}
