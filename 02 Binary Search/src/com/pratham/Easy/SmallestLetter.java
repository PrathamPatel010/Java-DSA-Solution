//  https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
package com.pratham.Easy;

public class SmallestLetter {
    public static void main(String[] args) {

    }

    public static char nextGreatestLetter(char[] letters, char target){
        // sorted array is given, we are told to search for something.
        // just do according to binary search concept.
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
