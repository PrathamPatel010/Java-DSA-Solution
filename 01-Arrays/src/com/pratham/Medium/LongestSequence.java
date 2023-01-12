//  https://leetcode.com/problems/longest-consecutive-sequence/description/
package com.pratham.Medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSequence {
    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};
        int ans = longestConsecutive1(arr);
        System.out.println(ans);

    }

    // Brute : sort the array & count
    // will not work for duplicates
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxConsecutive = 0;
        int currConsecutive = 1;
        int prev = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==prev+1){
                currConsecutive++;
                prev = nums[i];
            } else{
                currConsecutive = 0;
            }
            maxConsecutive = Math.max(currConsecutive,maxConsecutive);
        }
        return maxConsecutive;
    }

    // optimized: Using Hashset
    public static int longestConsecutive1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums){
            set.add(x);
        }
        int maxConsecutive = 0;
        for(int i=0;i<nums.length;i++){
            if (!set.contains(nums[i]-1)) {
                int currConsecutive = 1;
                int currNum = nums[i];
                while(set.contains(currNum+1)){
                    currConsecutive++;
                    currNum++;
                }
                maxConsecutive = Math.max(currConsecutive,maxConsecutive);
            }
        }
        return maxConsecutive;
    }


}
