//  https://leetcode.com/problems/majority-element-ii/
package com.pratham.Medium;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementsII {
    public static void main(String[] args) {
        int[] arr = {2,2};
        List<Integer> ans = majorityElement(arr);
        System.out.println(ans);
    }

    // Brute: nested loops
    // will not work in all cases
    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(nums.length==1){
            ans.add(nums[0]);
            return ans;
        }
        for (int i = 0; i < nums.length; i++) {
            int curr = 1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    curr++;
                }
            }
            if(curr>(nums.length/3)){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
