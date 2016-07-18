package com.code.rank;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Administrator on 7/15/2016.
 */
public class MissingNumbers {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        Map<Integer, Integer> data = new HashMap<>();
        int length = stdin.nextInt();
        for (int i=0; i<length; i++){
            int value = stdin.nextInt();
            int count = data.getOrDefault(value, 0);
            data.put(value, count+1);
        }

        Map<Integer, Integer> data2 = new HashMap<>();
        int length2 = stdin.nextInt();
        for (int j=0; j<length2; j++){
            int value = stdin.nextInt();
            int count = data2.getOrDefault(value, 0);
            data2.put(value, count+1);
        }

        PriorityQueue<Integer> queues = new PriorityQueue<>();
        data2.forEach((k,v)-> {
            if(data.get(k) == null || data2.get(k) > data.get(k)){
                queues.add(k);
            }
        });

        queues.forEach((n)->{
            System.out.println(n);
        });

        stdin.close();
    }
}
