//  https://leetcode.com/problems/majority-element-ii/
package com.pratham.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementsII {
    public static void main(String[] args) {
        int[] arr = {4,2,1,1};
        List<Integer> ans = majorityElement3(arr);
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

    // Better : will work in all cases
    public static List<Integer> majorityElement2(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(maps.containsKey(nums[i])){
                maps.put(nums[i],maps.get(nums[i])+1);
            } else{
                maps.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e : maps.entrySet()){
            int getVal = e.getValue();
            if(getVal>(nums.length/3)){
                ans.add(e.getKey());
            }
        }
        return ans;
    }

    //Optimized : Boyer moore's voting algo
    public static List<Integer> majorityElement3(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int c1=0,c2=0;
        int n1=-1,n2=-1;

        for(int x : nums){
            if(x==n1){
                c1++;
            } else if(x==n2){
                c2++;
            } else if(c1==0){
                n1 = x;
                c1=1;
            } else if(c2==0){
                n2 = x;
                c2 = 1;
            } else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==n1){
                c1++;
            } else if(nums[i]==n2){
                c2++;
            }
        }
        if(c1>(nums.length/3)){
            ans.add(n1);
        }
        if (c2>(nums.length/3)){
            ans.add(n2);
        }
        return ans;
    }


}
