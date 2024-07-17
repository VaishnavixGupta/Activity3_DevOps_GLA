package com.vaish.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    //Time Complexity :
    //                   Best: O(N^2)
    //                   Worst: O(N^2)     //n is size of array
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the max item in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int max = getMaxIndex(arr,0,last);

            swap(arr,max,last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end){
      int max=start;
      for(int i=start; i<=end; i++){
          if(arr[max]<arr[i]){
              max=i;
          }
      }
      return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
