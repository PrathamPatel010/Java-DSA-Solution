package com.pratham;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class MinElementInRotatedArray {
    public static void main(String[] args) {

    }

    public int findMin(int[] nums) {
        // simple algorithm for finding pivot index
        // instead of returning pivot index
        // just return element after pivot index
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            // 4 cases here
            if (mid<end && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if (nums[start]<nums[mid]){
                start=mid+1;
            } else{
                // here, arr[start]>arr[mid]
                end=mid-1;
            }
        }
        // if it is not rotated sorted array, we cannot find pivot.
        // means the array is sorted.
        // just return first element
        return nums[0];
    }
}
