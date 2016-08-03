package com.code.rank.search;

import java.util.Scanner;

/**
 * Created by Administrator on 7/19/2016.
 */
public class SherlockArray {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int t = stdin.nextInt();
        for (int i=0; i<t; i++){
            int n = stdin.nextInt();
            int sum = 0;
            int left = 0;
            int[] a = new int[n];
            boolean flag = false;

            for (int j=0; j<a.length; j++){
                a[j] = stdin.nextInt();
                sum += a[j];
            }

            for (int k=0; k<a.length; k++){
                sum -= a[k];

                if(left == sum) {
                    flag = true;
                    break;
                }

                left += a[k];
            }

            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
