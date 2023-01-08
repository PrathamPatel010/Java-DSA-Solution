//https://leetcode.com/problems/majority-element/

package com.pratham.Medium;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement2(arr));
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

    // Better:Using Hashmaps
    public static int majorityElement2(int[] nums) {
        HashMap<Integer,Integer> maps = new HashMap<>();
        int majVal=0;
        int majKey=0;
        for(int i=0;i<nums.length;i++){
            if(maps.containsKey(nums[i])){
                maps.put(nums[i],maps.get(nums[i])+1);
            } else{
                maps.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e : maps.entrySet()){
            if(e.getValue()>majVal){
                majVal = e.getValue();
                majKey = e.getKey();
            }
        }
        return majKey;
    }

    // Optimized: Moore's voting algo
    public static int majorityElement3(int[] nums) {
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ans = nums[i];
            }
            if(nums[i]==ans){
                count++;
            } else{
                count--;
            }
        }
        return ans;
    }
}
