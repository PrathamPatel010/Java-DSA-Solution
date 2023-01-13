//  https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
package com.pratham.Easy;

public class RotatedArrayII {
    public static void main(String[] args) {

    }

    public static boolean search(int[] nums, int target) {
        for(int x : nums){
            if(x==target){
                return true;
            }
        }
        return false;
    }
}
