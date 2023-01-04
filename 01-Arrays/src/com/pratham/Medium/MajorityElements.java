//https://leetcode.com/problems/majority-element/

package com.pratham.Medium;

import java.util.HashMap;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    // Brute force : O(N*N)
    public static int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=(nums.length/2)){
                return nums[i];
            }
        }
        return -1;
    }

    // Optimized: Moore's voting algo
    public int majorityElement2(int[] nums) {
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ans = nums[i];
            }
            if(ans==nums[i]) {
                count++;
            } else{
                count--;
            }
        }
        return ans;
    }
}
