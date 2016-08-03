package com.code.rank.sort;

/**
 * Created by Administrator on 7/19/2016.
 */
public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {2,3,4,10,48};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n-1, x);

        if(result < 0){
            System.out.println("Element is not present");
        }else{
            System.out.println("Element is present at index "+result);
        }
    }

    static int binarySearch(int[] arr, int l, int r, int x){
        if(r >= l){
            int mid = l + (r-l)/2;

            //if the element present in them middle
            if(arr[mid]==x){
                return mid;
            }

            //if the element smaller than mid, then it can be only present in the left array
            if(x < arr[mid]){
                return binarySearch(arr,l, mid-1,x);
            }

            //If the element is greater than mid, then it can be only present in the right array
            return binarySearch(arr, mid+1,r,x);
        }

        //We reach here when element is not present in array
        return -1;
    }

}
