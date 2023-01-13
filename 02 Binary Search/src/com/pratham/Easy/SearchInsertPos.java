//https://leetcode.com/problems/search-insert-position/

package com.pratham.Easy;

public class SearchInsertPos {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(search(arr,2));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target){
                end = mid-1;
            } else if(nums[mid]<target){
                start = mid+1;
            }
        }
        return start;
    }



}
