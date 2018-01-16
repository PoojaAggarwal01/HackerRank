package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankInAString {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        boolean ishacker = false;
        char[] ch = new char[] { 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k' };
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            String sd ="";
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                char c=s.charAt(i);
                if ( c== ch[j]){
                    //sd=sd+s.charAt(i);
                    if(j <ch.length-1) {
                    j++;
                }else{
                    break;
                }
                }
               
            }
            if (j==ch.length-1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
