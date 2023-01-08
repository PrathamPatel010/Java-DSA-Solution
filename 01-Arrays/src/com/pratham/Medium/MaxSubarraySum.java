//https://leetcode.com/problems/maximum-subarray/
package com.pratham.Medium;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2 = {-2,-1};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray1(arr));
        System.out.println(maxSubArray2(arr2));
    }

    // Brute force
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        // Generate all subarrays
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    // generate sum
                    sum += nums[k];
                }
                // check for largest sum here
                ans = Math.max(sum,ans);
            }
        }
        return ans;
    }

    // Better : Prefix Sum
    public static int maxSubArray1(int[] nums) {
        int[] ps = new int[nums.length];
        // generate prefixsum array
        ps[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            ps[i] = ps[i-1] + nums[i];
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                // generate sum using formula
                int sum = (i>0) ? (ps[j] - ps[i-1]) : ps[j];
                ans = Math.max(sum,ans);
            }
        }
        return ans;
    }

    // Optimized : Modified Kadane's Algo
    public static int maxSubArray2(int[] nums) {
        int maxSoFar=nums[0], maxTillHere=nums[0];
        for (int i=1;i<nums.length;i++){
            maxTillHere= Math.max(maxTillHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar, maxTillHere);
        }
        return maxSoFar;
    }
}

