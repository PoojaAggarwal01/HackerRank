package com.hackerrank.algorithms.greedy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class JimAndTheOrders {

    static Integer[] jimOrders(int[][] orders,int n) {
    	
    	Map<Integer,Integer> map=new HashMap<>();
    	List<Integer> orderedList=new ArrayList<>();
    	for(int i=0;i<n;i++)
    	{
    		map.put(i, orders[i][0]+orders[i][1]);
    	}
    	Set<Entry<Integer, Integer>> set = map.entrySet();
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>()
        {
        	@Override
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 )
            {
        		if((o2.getValue()).compareTo( o1.getValue() )==0)
        		{
        			return (o2.getKey()).compareTo( o1.getKey() );
        		}
                return (o2.getValue()).compareTo( o1.getValue() );
            }

        } );
        
        for(Map.Entry<Integer, Integer> entry:list){
        	orderedList.add(entry.getKey()+1);
        }
        Collections.reverse(orderedList);
		return orderedList.toArray(new Integer[orderedList.size()]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] orders = new int[n][2];
        for(int orders_i = 0; orders_i < n; orders_i++){
            for(int orders_j = 0; orders_j < 2; orders_j++){
                orders[orders_i][orders_j] = in.nextInt();
            }
        }
        Integer [] result = jimOrders(orders,n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
