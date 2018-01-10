package com.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SequenceEquation {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        Map<Integer,Integer> map=new HashMap<>();
	        int n = in.nextInt();
	        int a[] = new int[n];
	      
	          
	           
	            for(int a_i=0; a_i < n; a_i++){
	                a[a_i] = in.nextInt();
	               map.put(a[a_i], a_i+1);
	        
	    }
	            for(int i=1;i<=n;i++)
	            {
	            	int x=map.get(i);
	            	int y=map.get(x);
	            	System.out.println(y);
	            }
	 }
}
