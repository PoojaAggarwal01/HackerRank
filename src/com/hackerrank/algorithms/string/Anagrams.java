package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {

   static int anagaram(String s){
        Map<Character,Integer > countMap=new HashMap<Character, Integer>();
        int count=0;
        int a=0,b=0;
        if(s.length()%2!=0)
        {
        	return -1;
        }
        for(int i=0;i<(s.length())/2;i++)
        {
            if(!countMap.containsKey(s.charAt(i)))
            {
              
                countMap.put(s.charAt(i), 1);
            }
            else{
                a=countMap.get(s.charAt(i))+1;
                countMap.put(s.charAt(i), a);
            }
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            if(countMap.containsKey(s.charAt(i)) && countMap.get(s.charAt(i))!=0 )
            {
            	countMap.put(s.charAt(i),countMap.get(s.charAt(i))-1);
            }
            
            
        }
        
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
        	
        
                count=count+entry.getValue();
          
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagaram(s);
            System.out.println(result);
        }
    }
}
