//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package com.pratham.Easy;

import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] ans = searchRange(arr,8);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;
    }

    static int search(int[] arr, int target, boolean firstIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid - 1;
            } else if(arr[mid]<target){
                start = mid + 1;
            } else{
                // here, arr[mid] = target, hence possible ans found
                ans = mid;
                // now, if you are looking for first index, more target can be there in left of mid
                if(firstIndex){
                    end = mid-1;
                } else{     // else, for last index you will get more target in right of mid
                    start = mid + 1;
                }
            }
        }
        return ans;
    }



}
