package com.pratham.Easy;
//https://leetcode.com/problems/max-consecutive-ones/
public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            // check at every element
            if(nums[i]==1){
                // increment count by 1
                count++;
            } else {
                // it means that consecutive ones is finished, reset count to 0
                count=0;
            }
            max = Math.max(count,max);
        }
        return max;
    }

}
