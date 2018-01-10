package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AcmIcpcTeam {
	static int[] acmTeam(String[] topic, int m) {
		int[] arr = new int[2];
		int[] maxArr = new int[m];
		for (int i = 0; i < topic.length; i++) {
			
			for (int j = i + 1; j < topic.length; j++) {
				int c = 0;
				for (int k = 0; k < topic[i].length(); k++) {
					if ((topic[i].charAt(k) + "" + topic[j].charAt(k)) .equals("11")
							|| (topic[i].charAt(k) + "" + topic[j].charAt(k)) .equals("10")
							|| (topic[i].charAt(k) + "" + topic[j].charAt(k)) .equals("01")) {
						c++;
					}
				}
				
				maxArr[c-1]++;
			}
			
		}
		for (int i = maxArr.length - 1; i > 0; i--) {
			if (maxArr[i] != 0) {
				arr[0] = i+1;
				arr[1] = maxArr[i];
				break;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		String[] topic = new String[n];
		for (int topic_i = 0; topic_i < n; topic_i++) {
			topic[topic_i] = in.next();
		}
		int[] result = acmTeam(topic, m);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}
}
