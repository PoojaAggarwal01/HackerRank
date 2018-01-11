package com.hackerrank.algorithms.implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LisasWorkbook {

   	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k=in.nextInt();
		int pageNo=1;
		int count=0;
		
		
		int [] chapters = new int[n];
		for (int i = 0; i < n; i++) {
			chapters[i] = in.nextInt();
			int j=1;
			int last=0;
			int s=chapters[i];
			int first = 0;
			while(s>0)
			{
				
				if(chapters[i]<k)
				{
					last=chapters[i];
				}
				else{
				last=k*j;
				}
				j++;
				
				if(last>chapters[i])
					last = chapters[i];
				
				if(pageNo>=(first+1) && pageNo<=last)
				{
					count++;
					
				}
				
				first += k;
				pageNo++;
				s=s-k;
			}
			
		}

	System.out.println(count);
		
		
	}
}