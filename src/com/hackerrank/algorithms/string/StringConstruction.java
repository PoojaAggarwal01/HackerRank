package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringConstruction {

    static int stringConstruction(String s) {
        Map<Character,Integer> countMap=new HashMap<>();
        int count=0;
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
       
        return countMap.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
