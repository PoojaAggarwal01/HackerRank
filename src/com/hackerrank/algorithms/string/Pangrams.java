package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {
    public static void main(String args[] ) throws Exception {
Scanner in = new Scanner(System.in);
       Map<Character,Boolean> pangram=new HashMap<Character, Boolean>();
        String s = in.nextLine();
          s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
        	pangram.put(s.charAt(i), true);
        }
        if(pangram.size()>26)
        {
        	System.out.println("pangram");
        }
        else{
        	System.out.println("not pangram");
        }
    
    }
}
