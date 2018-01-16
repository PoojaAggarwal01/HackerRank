package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones1 {

static String gameOfThrones(String s){
        Map<Character,Integer> countMap=new HashMap<>();
        int count=0;

        if(s.length()==1)
        {
            return "YES";
        }
        else {
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
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue()%2!=0) {
                count++;
               
            }
        }
            if(count>1)
            {
                return "NO";
            }
            else if(count==1 && s.length()%2==0)
            {
                return "NO";
            }
        
        return "YES";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
