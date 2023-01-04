//https://leetcode.com/problems/sort-colors/description/

package com.pratham.Medium;
import java.util.Arrays;

import static com.pratham.Easy.MoveZeros.swap;

public class SortArrayOf012 {
    public static void main(String[] args) {

    }

    // Brute force: using library function
    // Time: O(NlogN)
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    // Better: Using counting sort
    public void sortColors2(int[] nums) {
        // count no. of 0,1,2
        int c0=0,c1=0,c2=0;
        for (int num : nums) {
            if (num == 0) {
                c0++;
            } else if (num == 1) {
                c1++;
            } else {
                c2++;
            }
        }
        // now put the 0s,1s,2s in the array
    }

    // Optimized: Dutch National Flag Algo
    public void sortColors3(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while (mid<=high){
            switch(nums[mid]){
                case 0:{
                    swap(nums,low,mid);
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    swap(nums,mid,high);
                    mid++;
                    high--;
                    break;
                }
            }
        }
    }


}
