package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    static String caesarCipher(String s, int k) {
    	for(int i=0;i<s.length();i++)
    	{
    		
    	}
    
		return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
