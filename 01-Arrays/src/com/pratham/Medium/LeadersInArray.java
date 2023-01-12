package com.pratham.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders2(arr,arr.length));
    }

    // Brute: Time:O(N*N)
    static ArrayList<Integer> leaders(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                ans.add(arr[i]);
            }
        }
        ans.add(arr[arr.length-1]);
        return ans;
    }

    // Optimized: Time:O(N)
    static ArrayList<Integer> leaders2(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
