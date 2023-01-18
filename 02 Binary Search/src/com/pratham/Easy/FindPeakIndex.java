//  https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
package com.pratham.Easy;

public class FindPeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        // loop breaking condition : when start&end point to same element
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // we are in decsending part of array,hence mid can be answer. but more answers can be found in left of mid
                end = mid;
            } else if(arr[mid]<arr[mid+1]){
                // we are in ascending part of array, hence this cannot be the answer. but answer can be found in right of mid.
                start = mid + 1;

            }
        }
        // at each step start & end will decrease the search space & try to find peak element. In the end, both will point to one element.
        // here, loop will break. both start & end pointer will point to just one element i.e. peak element.
        // we can return anything start OR end
        return start;
    }

}
