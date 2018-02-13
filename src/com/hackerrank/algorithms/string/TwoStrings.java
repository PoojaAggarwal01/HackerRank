package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    static String twoStrings(String s1, String s2){
    	Map<Character,Integer[]> countMap=new HashMap<>();
    	for(int i=0;i<s1.length();i++)
    	{
    		if(!countMap.containsKey(s1.charAt(i)))
    		{
    			countMap.put(s1.charAt(i),new Integer[]{1,0});
    		}
    		else{
    			countMap.put(s1.charAt(i),new Integer[]{(countMap.get(s1.charAt(i))[0]+1),countMap.get(s1.charAt(i))[1]});
    		}
    	}
    	
    	for(int i=0;i<s2.length();i++)
    	{
    		if(countMap.containsKey(s2.charAt(i)))
    		{
    			countMap.put(s2.charAt(i),new Integer[]{(countMap.get(s2.charAt(i))[0]),countMap.get(s2.charAt(i))[1]+1});
    		}
    	}
    	
    	for(Entry<Character, Integer[]> entry:countMap.entrySet())
    	{
    		if(entry.getValue()[1]!=0)
    		{
    			return "YES";
    		}
    	}
		return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
