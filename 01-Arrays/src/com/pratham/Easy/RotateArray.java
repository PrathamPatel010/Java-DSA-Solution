package com.pratham.Easy;
// Problem: Rotate the array to left by one element
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(RotateArr(arr)));
        System.out.println(Arrays.toString(Rotate(arr)));
    }

    // brute force approach
    // Time:O(N), Space:O(N)
    static int[] RotateArr(int[] arr){
        // create a dummy array
        int[] temp = new int[arr.length];
        // copy all elements from index 1 to last element
        for(int i=1;i<arr.length;i++){
            temp[i-1] = arr[i];
        }
        // assign first element to the end index
        temp[temp.length-1] = arr[0];
        return temp;
    }

    // optimized approach
    // Time:O(N), Space:O(1)
    static int[] Rotate(int[] arr){
        // store first element inside temp variable
        int temp = arr[0];
        // shift all remaining elements to left by one place
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        // assign values of temp to last element
        arr[arr.length-1] = temp;
        return arr;
    }

}
