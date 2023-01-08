//https://leetcode.com/problems/sort-colors/description/

package com.pratham.Medium;
import java.util.Arrays;

import static com.pratham.Easy.MoveZeros.swap;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(arr));
        sortColors3(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Brute force: using library function
    // Time: O(NlogN)
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    // Better: by counting and putting
    // Time:O(N) && Space:O(1)
    public static void sortColors2(int[] nums) {
        int c0=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            } else if(nums[i]==1){
                c1++;
            } else{
                c2++;
            }
        }
        // put all elements in array
        int j=0;
        while(c0!=0){
            nums[j] = 0;
            j++;
            c0--;
        }
        while(c1!=0){
            nums[j] = 1;
            j++;
            c1--;
        }
        while(c2!=0){
            nums[j] = 2;
            j++;
            c2--;
        }
    }

    // Optimized: Dutch National Flag Algo
    public static void sortColors3(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            } else if(nums[mid]==1){
                mid++;
            } else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
}
