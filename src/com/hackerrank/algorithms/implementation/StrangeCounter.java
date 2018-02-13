package com.hackerrank.algorithms.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrangeCounter {

    static long strangeCode(long t) {
    	
    	long start=1,end=3,count=1;
    	double value=0;
    	while(t<start || t>end)
    	{
    		start=end;
    		end=(start+(long) (3*Math.pow(2, count)));
    		value= 3*(Math.pow(2, count));
    		count++;
    		
    	}
    	
    		return (end-start+1)-(t-start);
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long result = strangeCode(t);
        System.out.println(result);
        in.close();
    }
}
