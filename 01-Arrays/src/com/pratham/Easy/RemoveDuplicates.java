package com.pratham.Easy;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // here, I have declared 2 arrays containing same elements to show same output.
        // because we can't use both method at the same time. otherwise, array will be modified and it will lead to wrong answer.
        int[] arr1 = {1,2,2,2,3,3};
        int[] arr2 = {1,2,2,2,3,3};
        System.out.println(remove_duplicate(arr1, arr1.length));
        System.out.println(remove_duplicate2(arr2,arr2.length));

    }



    // Brute force approach using HashSet
    // method will return modified size of the array
    static int remove_duplicate(int[] A,int N) {
        HashSet<Integer> set = new HashSet<>();
        // hashset will take only unique elements
        for(int i=0;i<A.length;i++) {
            set.add(A[i]);
        }
        int k = set.size();
        int i=0;
        for(int x : set){
            A[i] = x;
            i++;
        }
        return k;
    }

    // Optimization: Two-pointers method
    static int remove_duplicate2(int[] A,int N) {
        int i = 0;
        for (int j = 1; j < N; j++) {
            if (A[j] != A[i]) {
                i++;
                A[i] = A[j];
            }
        }
        return i+1;
    }
}
