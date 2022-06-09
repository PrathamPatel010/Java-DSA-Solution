package com.pratham;
//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RotatedBinarySearch {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target){
        int pivot = findPivot(nums);
        if (pivot==-1){
            // means array is not rotated, just do normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }

        // if pivot!=-1, we have 2 sorted ascending arrays.
        // just do binary search
        int firstTry = binarySearch(nums,target,0,pivot);
        if (firstTry!=-1){
            return firstTry;
        }
        // else apply binary search in remaining region
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }


    int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start = mid+1;
            } else if(target<arr[mid]){
                end= mid-1;
            } else{
                return mid;
            }
        }
        return -1;
    }


    // whenever you are given sorted rotated array.
    // find pivot index first.
    // keep in mind that pivot=largest element in the array.
    int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            // 4 cases here
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[start]<arr[mid]){
                start=mid+1;
            } else{
                // here, arr[start]>arr[mid]
                end=mid-1;
            }
        }
        // if it is not rotated sorted array, we cannot find pivot.
        // so, if it is not found, return -1.
        return -1;
    }
}
