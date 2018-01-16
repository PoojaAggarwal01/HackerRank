package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    static String funnyString(String s){
int n = s.length();
		String r = null;
		for (int i = 0; i < n/2; i++) {
			if (i<n-1 && Math.abs(s.charAt(i) - s.charAt(i + 1)) == Math.abs(s.charAt(n - i - 1) - s.charAt(n - i - 2))) {
				r = "Funny";
			} else {
				r = "Not Funny";
				break;
			}
		}
		return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
