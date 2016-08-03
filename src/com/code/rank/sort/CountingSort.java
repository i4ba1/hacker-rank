package com.code.rank.sort;

import java.util.Arrays;

/**
 * Created by muhamad on 03/08/16.
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 12, 4, 9, 13};
        int[] result = new int[arr.length];
        int[] positions = new int[arr.length];
        String[] minMax = findMinMaxArray(arr).split(":");

        int min = Integer.valueOf(minMax[0]);
        int max = Integer.valueOf(minMax[1]);

        int[] sumCount = new int[max - min + 1];
        int[] count = new int[max - min + 1];
        for (int k = 0; k < count.length; k++) {
            count[k] = 0;
        }

        int[] index = new int[max - min + 1];
        int idx = 0;
        for (int i = min; i <= max; i++) {
            index[idx] = i;
            idx++;
        }

        for (int j = 0; j < arr.length; j++) {
            boolean isAppeared = checkAppearedNumber(arr, arr[j]);
            int y = 0;
            int idxArrIndex = foundIndex(index, arr[j]);

            if (isAppeared) {
                for (int x : arr) {
                    if (x == arr[j]) {
                        y++;
                    }
                }
                count[idxArrIndex] = y;
            } else {
                y++;
                count[idxArrIndex] = y;
            }
        }

        for (int n = 0; n < count.length; n++) {
            if (n == 0) {
                sumCount[n] = count[n];
            } else {
                sumCount[n] = sumCount[n - 1] + count[n];
            }

            //System.out.println(sumCount[n]);
        }

        int t  = 0;
        boolean isSame = false;
        for (int m = 0; m <= sumCount.length-1; m++) {

            if(m+1 < sumCount.length) {
                if (sumCount[m] == sumCount[m + 1]) {
                    positions[t] = sumCount[m];
                    isSame = true;
                } else {
                    positions[t] = sumCount[m];
                    t++;
                }
            }else{
                positions[t] = sumCount[m];
            }
        }

        for (int d=0; d<positions.length; d++) {
            System.out.println(positions[d]);
        }

    }

    private static int foundIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return 0;
    }

    private static boolean checkAppearedNumber(int[] arr, int key) {
        return Arrays.asList(arr).contains(key);
    }

    private static String findMinMaxArray(int[] a) {
        if (a == null || a.length == 0)
            return null;

        int max = a[0];
        int min = a[0];

        for (int i = 1; i <= a.length - 1; i++) {
            if (min > a[i]) {
                min = a[i];
            }

            if (max < a[i]) {
                max = a[i];
            }
        }
        return min + ":" + max;
    }
}
