package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifiedKaprekarNumbers {
	 static long[] kaprekarNumbers(int p, int q) {
		 long i=p;
		 List<Long> arr=new ArrayList<>();
		
		 if(p<=1 && q>=1)
		 {
			arr.add(1L);
			
		 }
		
		 while(i<=q)
		 {
			 int n=String.valueOf(i).length();
			 long sqr=i*i;
			 int sqrN=String.valueOf(sqr).length();
			 int a;
			 int b;
			if(sqrN>=2)
			{
				 if(sqrN%2==0)
				 {
				 a=Integer.parseInt(String.valueOf(sqr).substring(0, n));
				 b =Integer.parseInt(String.valueOf(sqr).substring(n));
				 }
				 else{
					 a=Integer.parseInt(String.valueOf(sqr).substring(0, n-1));
					 b =Integer.parseInt(String.valueOf(sqr).substring(n-1));
				 }
				
				 if(b!=0)
				 {
				 if(a+b==i)
				 {
					arr.add(i);
				 }
				 }
			}
			
			 i++;
			 
		 }
		return arr.stream().mapToLong(Long::intValue).toArray();

	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int p = in.nextInt();
	        int q = in.nextInt();
	        long[] result = kaprekarNumbers(p, q);
	        if(result.length==0)
	        {
	        	System.out.println("INVALID RANGE");
	        }
	        else{
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	        System.out.println("");

	        }
	        in.close();
	    }
}
