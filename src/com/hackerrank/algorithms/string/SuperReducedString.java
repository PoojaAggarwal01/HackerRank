package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    static String super_reduced_string(String s){
        //StringBuilder sb=new StringBuilder(s);
        String result=null;
       for(int i=1;i<s.length();i++)
       {
           if(s.charAt(i-1)==s.charAt(i))
           {
               s = s.substring(0,i-1)+s.substring(i+1) ;
               i=0;
               }
           
       }
      
    if(s==null || s.isEmpty())
    {
        s="Empty String";
    }
        else if(s.length()==2 && s.charAt(0)==s.charAt(1))
           {
               s="Empty String";
           }
        
    return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
