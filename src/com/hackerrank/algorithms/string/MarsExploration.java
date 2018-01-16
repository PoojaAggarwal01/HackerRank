package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;

        for (int i = 0; i < S.length(); i = i + 3) {
            if (S.charAt(i) != 'S') {
                count++;
            }
            if (S.charAt(i + 1) != 'O' && i<S.length()-1) {
                count++;
            }
            if (S.charAt(i + 2) != 'S' && i < S.length() - 2) {
                count++;
            }

        }

        System.out.println(count);

    }
}
