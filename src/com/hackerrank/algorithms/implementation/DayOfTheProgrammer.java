package com.hackerrank.algorithms.implementation;

import java.util.Calendar;
import java.util.Scanner;

public class DayOfTheProgrammer {
	static String solve(int year) {
		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.DAY_OF_YEAR, 256);
		calendar.set(Calendar.YEAR, year);
		if (year >= 1700 && year <= 1917 && year % 4 == 0 && year % 100 == 0) {
			return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH) - 1) + "." + 0
					+ String.valueOf(calendar.get(Calendar.MONTH) + 1) + "." + year;
		} else if (year == 1918) {
			return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH) + 13) + "." + 0
					+ String.valueOf(calendar.get(Calendar.MONTH) + 1) + "." + year;
		}
		return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)) + "." + 0
				+ String.valueOf(calendar.get(Calendar.MONTH) + 1) + "." + year;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String result = solve(year);
		System.out.println(result);
	}
}
