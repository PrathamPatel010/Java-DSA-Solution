package com.pratham.Easy;
//  https://leetcode.com/problems/subarray-sum-equals-k/

import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1};
        int k = 3;
        System.out.println(subarraySum(nums,k));

    }


    // Optimized Approach: Using Hashmaps
    static int subarraySum(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
