package com.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheTimeInWords {

	static String timeInWords(int h, int m) {

		String[] time = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
				"twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine" };
		
		if(m==0)
		{
			return time[h-1]+" "+"o' clock";
		}
		else if(m<30 && m!=15)
		{
			return m==1?time[m-1]+" minute past "+time[h-1]:time[m-1]+" minutes past "+time[h-1];
		}
		else if(m==15)
		{
			return "quarter past "+time[h-1];
		}
		else if(m==45)
		{
			return "quarter to "+time[h-1];
		}
		else if(m>30 && m!=45)
		{
			return time[(60-m)-1]+" minutes to "+time[h];
		}
		return "half past "+time[h-1];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		String result = timeInWords(h, m);
		System.out.println(result);
		in.close();
	}
}
