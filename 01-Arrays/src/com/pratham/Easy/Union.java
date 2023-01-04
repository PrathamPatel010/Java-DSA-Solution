package com.pratham.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5};
        int[] nums = {11,1,2,3,4};
        System.out.println(findUnion(arr,nums, arr.length, nums.length));
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < m; j++) {
            set.add(arr2[j]);
        }

        for (int x : set){
            list.add(x);
        }
        return list;
    }
}
