//  https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
package com.pratham.Easy;

public class FindMin {
    public static void main(String[] args) {

    }

    public static int findMin(int[] nums) {
        // simple algorithm for finding pivot index
        // instead of returning pivot index, just return element after pivot index.
        int pivot = findPivot(nums);
        if(pivot==-1){  // that means array is not rotated, just return first element.
            return nums[0];
        } else{
            return nums[pivot+1];
        }
    }

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
