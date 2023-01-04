package com.pratham.Easy;
//https://practice.geeksforgeeks.org/problems/second-largest3735/&utm_campaign=second-largest
public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34,1};
        System.out.println(print2largest(arr,arr.length));

    }

    static int print2largest(int[] arr, int n) {
        return getSecond(arr);
    }

    static int getMax(int[] arr){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int getSecond(int[] arr){
        int ans=-1;
        int max = getMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans && arr[i]<max){
                ans = arr[i];
            }
        }
        return ans;
    }

}
