//  https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
package com.pratham.Medium;
import java.util.*;

public class ReArrangeArray {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                pos.add(nums[i]);
            } else{
                neg.add(nums[i]);
            }
        }
        int p=0,n=0;
        for(int i=0;i< nums.length;i++){
            if(i%2==0){
                nums[i] = pos.get(p);
                p++;
            } else{
                nums[i] = neg.get(n);
                n++;
            }
        }
        return nums;
    }
}
