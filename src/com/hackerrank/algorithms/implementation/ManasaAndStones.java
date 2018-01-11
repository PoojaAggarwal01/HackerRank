package com.hackerrank.algorithms.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaAndStones {

     static int[] stones(int n, int a, int b) {
		 
		 Set<Integer> numSet=new TreeSet<>();
		 for(int i=0;i<n;i++)
		 {
			 numSet.add(a*(n-i-1)+b*i);
			
		 }
		return numSet.stream().mapToInt(Integer::intValue).toArray();
	    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int[] result = stones(n, a, b);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
