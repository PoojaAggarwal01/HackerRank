package com.hackerrank.algorithms.greedy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumToys {

    static int maximumToys(int[] prices, int k) {
    	
    	Arrays.sort(prices);
    	int count=1;
    	Integer sum=prices[0];
    	if(sum>k)
    	{
    		count=0;
    	}
    	for(int i=1;i<prices.length;i++ )
    	{
    		sum+=prices[i];
    		if(sum<=k)
    		{
    			count++;
    			
    		}
    		else{
    			break;
    		}
    	}
    			
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];
        for(int prices_i = 0; prices_i < n; prices_i++){
            prices[prices_i] = in.nextInt();
        }
        int result = maximumToys(prices, k);
        System.out.println(result);
        in.close();
    }
}
