package com.vaish.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    //Time Complexity :
    //                   Best: O(N)         //when array is sorted
    //                   Worst: O(N^2)     //n is size of array //descending sorted
    // i will run till n-2 because j+1 and j will go out of bound
    //no. of swaps reduced as compared to bubble sort

    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){ //i<=arr.length-2
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
