package com.pratham;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexInMountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr){
        // sorted array -> apply binary search
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                // means we are in the decreasing part of the array.
                // mid can be possible answer.
                // but look in the left
                end = mid;
            } else{
                // here, arr[mid]<arr[mid+1]
                // means we are in the increasing part of the array.
                // hence, more possible answers could lie after mid
                start = mid+1;
            }
            // at the end, both start & end pointer will point to just one number.
            // start==mid, while loop will break.
            // i.e. our peak element.
        }
        // return start or end as both will point to peak element.
        return start;
    }

}
