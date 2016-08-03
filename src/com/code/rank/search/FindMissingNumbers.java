package com.code.rank.search;

/**
 * Created by Administrator on 7/14/2016.
 */
public class FindMissingNumbers {
    public static void main(String[] args){
        int a[] = {1,2,4,5,6};
        int n = a.length;
        int total = (n+1)*(n+2)/2;
        int count = 0;

        for (int i=0; i<n; i++){
            total -= a[i];
        }

        System.out.println(total);
    }
}
