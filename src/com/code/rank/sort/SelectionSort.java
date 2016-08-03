package com.code.rank.sort;

/**
*/
public class SelectionSort{
  public static void main(String[] args){
    int arr[] = {5, 1, 12, -5, 16, 2, 12, 14};
    int n = arr.length;

    for(int i=0; i<n-1; i++){
      int minIdx = i;

      for (int j=i+1; j<n; j++){
        if(arr[j] < arr[minIdx]){
          minIdx = j;
        }
      }

      if(minIdx != i){
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
      }

    }

    for (int k:arr) {
      System.out.print(k+" ");
    }
  }
}
