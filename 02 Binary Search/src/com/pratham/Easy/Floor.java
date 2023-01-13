//https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%3BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
package com.pratham.Easy;

public class Floor {
    public static void main(String[] args) {
        long[] arr = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr, arr.length,5));
    }

    static int findFloor(long[] arr, int n, long x) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==x){
                return mid;
            } else if (arr[mid]>x){
                end = mid-1;
            } else if(arr[mid]<x){
                start = mid+1;
            }
        }
        return end;
    }

}
