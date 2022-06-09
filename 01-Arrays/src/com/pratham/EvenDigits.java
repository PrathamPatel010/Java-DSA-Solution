package com.pratham;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {

    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums){
        int count=0;

        for(int num : nums){
            if(isEven(numbers(num))){
                count++;
            }
        }
        return count;
    }

    // this method will check if given number has even digit even or not
    boolean isEven(int num){
        return num%2==0;
    }


    // this method will count digits in a number
    int numbers(int num){
        int count=0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
