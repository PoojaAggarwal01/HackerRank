package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        Map<Character,Integer> countMap=new HashMap<>();
        Set<Integer> valueSet=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
        	if(!countMap.containsKey(s.charAt(i)))
        	{
        		countMap.put(s.charAt(i), 1);
        	}
        	else{
        		countMap.put(s.charAt(i), countMap.get(s.charAt(i))+1);
        	}
        }
        for(Map.Entry<Character, Integer> entry:countMap.entrySet())
        {
        	for(int i=1;i<=entry.getValue();i++)
        	{
        		valueSet.add((new Integer(entry.getKey())-97+1)* i);
        	}
        	
        	
        }
        int n = in.nextInt(); 
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if(valueSet.contains(x))
            {
            	System.out.println("Yes");
            }
            else{
            	System.out.println("No");
            }
        }
    }
}
