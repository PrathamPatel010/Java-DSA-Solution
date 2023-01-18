// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

package com.pratham.Easy;

public class RotatedArray {
    public static void main(String[] args) {

    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot==-1){
            // just apply normal binary search
            return binarySearch(nums,target,0,nums.length-1);
        }

        // search in first half
        int firstTry = binarySearch(nums,target,0,pivot);
        if(firstTry!=-1){
            return firstTry;
        } else{
            // search in the second half
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]>target){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }

    // this method will not work for duplicate values
    static int findPivot(int[] arr){
        // pivot is the index of largest element in sorted rotated array
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // case-1:
            if(mid<end && arr[mid]>arr[mid+1]){    // arr[] = [6,7,0]
                // mid is my pivot
                return mid;
            }
            // case-2:
            if(mid>start && arr[mid]<arr[mid-1]){    // arr[] = [7,0,1,2]
                // mid-1 is my pivot
                return mid-1;
            }
            // case-3:
            if(arr[start]>=arr[mid]){    // arr[] = [7,0,1,2]
                // all ele. after mid will be < start. hence, no need to check in right
                end = mid-1;
            }
            // case-4:
            if(arr[start]<=arr[mid]) {     // arr[] = [3,4,5,6,0]
                // all ele. before mid will be < mid. hence, no need to check in left.
                start = mid+1;
                // here, mid cannot be pivot. bcuz if it was pivot, it would have been caught in above cases. hence, ignore mid.
            }
        }
        return -1;
    }
}
