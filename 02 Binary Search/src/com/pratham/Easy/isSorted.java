//https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted
package com.pratham.Easy;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {90, 80, 100, 70, 40, 30};
        System.out.println(arraySortedOrNot(arr,arr.length));
    }

    static boolean arraySortedOrNot(int[] arr, int n) {
        boolean ans = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return ans;
    }

}
