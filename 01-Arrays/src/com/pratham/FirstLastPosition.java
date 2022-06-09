package com.pratham;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};    // return ans[]={-1,-1} if element is not found
        ans[0] = binarySearch(nums,target,true);
        ans[1] = binarySearch(nums,target,false);
        return ans;
    }

    // our task is to search for an element in a sorted array.
    // just apply binary search.
    int binarySearch(int[] nums, int target,boolean firstOccurrence){
        int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target>nums[mid]){
                start = mid+1;
            } else if(target<nums[mid]){
                end = mid-1;
            } else{
                // here, nums[mid]==target
                // i have found potential answer
                ans = mid;
                // here, if we are trying to search element's first occurrence, search in the left
                if (firstOccurrence){
                    end = mid-1;
                } else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
