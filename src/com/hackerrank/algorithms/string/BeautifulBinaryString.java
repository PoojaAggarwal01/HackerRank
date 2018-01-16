package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulBinaryString {

    static int minSteps(int n, String B){
int count=0;
		
		for(int i=0;i<n/2;i++)
		{
		if(B.contains("010"))
			{
				count++;
				B=B.substring(B.indexOf("010")+3);
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
