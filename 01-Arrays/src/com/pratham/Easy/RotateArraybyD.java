package com.pratham.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/
public class RotateArraybyD {
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        int k = 2;
//        rotate(arr,k);
        leftRotate(arr,k,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    // Brute force approach
    // Time:O(N), Space:O(k)
    static void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k>nums.length){
            return;
        }
        // create a dummy array
        int[] temp = new int[k];
        // store last k elements in temp array
        for(int i=nums.length-k;i<nums.length;i++){
            temp[i-nums.length+k] = nums[i];
        }
        // shift all remaining elements in array to right by k position
        for (int i=nums.length-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }
        // copy element from temp to original array
        for (int i=0;i<k;i++){
            nums[i] = temp[i];
        }
    }

    static void leftRotate(long arr[], int k,int n)
    {
        k = k%n;;
        if(k>n){
            return;
        }

        long[] temp = new long[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i] = temp[i-n+k];
        }


    }




}
