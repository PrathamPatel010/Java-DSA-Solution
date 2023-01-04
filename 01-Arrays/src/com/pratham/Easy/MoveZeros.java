package com.pratham.Easy;
//https://leetcode.com/problems/move-zeroes/description/

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(pushZeros(arr)));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));


    }

    // Brute force
    static int[] pushZeros(int[] arr){
        int[] temp = new int[arr.length];
        int k = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                temp[k] = arr[i];
                k++;
            }
        }
        while (k<arr.length){
            temp[k] = 0;
            k++;
        }
        return temp;
    }

    // Optimized Approach : 2 pointers
    public static void moveZeroes(int[] nums) {
        // find first occurrence of 0
        int k = 0;
        while (k<nums.length){
            if(nums[k]==0){
                break;
            } else{
                k++;
            }
        }

        // take 2 pointers, i & j
        // i will maintain the index where element is zero, j will maintain index where element!=0
        int i=k,j=i+1;
        while (i<nums.length&&j< nums.length){
            // if you find element at j!=0, swap it with element at i, then increment i
            if (nums[j]!=0){
                swap(nums,i,j);
                i++;
            } else{
                // otherwise just increment the value of j
                j++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
