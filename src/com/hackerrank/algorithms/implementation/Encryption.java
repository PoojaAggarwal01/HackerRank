package com.hackerrank.algorithms.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

    static String encryption(String s) {
    	
    	int rows=(int) Math.floor(Math.sqrt(s.length()));
    	int cols=(int) Math.ceil(Math.sqrt(s.length()));
    	StringBuilder s1=new StringBuilder();
    	for(int i=0;i<cols;i++)
    	{
    		for(int j=i;j<s.length();j=j+cols)
    		{
    			s1.append(s.charAt(j));
    		}
    		s1.append(" ");
    	}
		return s1.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = encryption(s);
        System.out.println(result);
        in.close();
    }
}
