package com.hackerrank.algorithms.string;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {

    static int gemstones(String[] arr) {
        Map<Character, Integer[]> countMap = new HashMap<>();
        int j = 0;
        int countFinal = 0;
        for (String str : arr) {
           
            for (int i = 0; i < str.length(); i++) {
                if (j == 0 && !countMap.containsKey(str.charAt(i))) {
                    countMap.put(str.charAt(i), new Integer[] { 1, j });
                }
                else if (countMap.containsKey(str.charAt(i)) && countMap.get(str.charAt(i))[1] != j) {
                    countMap.put(str.charAt(i), new Integer[] { countMap.get(str.charAt(i))[0]+1, j });
                }
            }
            j++;
        }

        for (Map.Entry<Character, Integer[]> entry : countMap.entrySet()) {
            if (entry.getValue()[0] == arr.length) {
                countFinal++;
            }
        }
        return countFinal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
