package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheLoveLetterMystery {

    static int theLoveLetterMystery(String s){
int count=0;
		int n=s.length();
		for(int i=0;i<n/2;i++)
		{
			if(s.charAt(i)>s.charAt(n-i-1))
			{
				count=count+s.charAt(i)-s.charAt(n-i-1);
			}
			else{
				count=count+s.charAt(n-i-1)-s.charAt(i);
			}
		}
		return count;    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
