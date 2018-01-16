package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakingAnagrams {

     static int makingAnagrams(String s1, String s2){
        Map<Character,Integer [] > countMap=new HashMap<>();
        int count=0;
        int a=0,b=0;
        for(int i=0;i<s1.length();i++)
        {
            if(!countMap.containsKey(s1.charAt(i)))
            {
                a=1;
                countMap.put(s1.charAt(i), new Integer[]{a,0});
            }
            else{
                a=countMap.get(s1.charAt(i))[0]+1;
                countMap.put(s1.charAt(i), new Integer[]{a,countMap.get(s1.charAt(i))[1]});
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(!countMap.containsKey(s2.charAt(i)))
            {b=1;
                countMap.put(s2.charAt(i), new Integer[]{0,b});
            }
            else{
                b=countMap.get(s2.charAt(i))[1]+1;
                countMap.put(s2.charAt(i),new Integer[]{countMap.get(s2.charAt(i))[0],b});
            }
        }
        
        for (Map.Entry<Character, Integer[]> entry : countMap.entrySet()) {
            if (entry.getValue()[0]!=entry.getValue()[1]) {
                count=count+Math.abs(entry.getValue()[0]-entry.getValue()[1]);
            }
        }
        return count;
    }
  

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
