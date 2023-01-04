//https://leetcode.com/problems/maximum-subarray/
package com.pratham.Medium;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray1(arr));
        System.out.println(maxSubArray2(arr));
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

    // Optimized : Kadane's Algo
    public static int maxSubArray2(int[] nums) {
        int current_sum=0;
        int max_sum=nums[0];
        for(int i=0;i<nums.length;i++){
            current_sum = current_sum + nums[i];
            if(current_sum<0){
                current_sum = 0;
            }
            max_sum = Math.max(current_sum,max_sum);
        }
        return max_sum;
    }

}
