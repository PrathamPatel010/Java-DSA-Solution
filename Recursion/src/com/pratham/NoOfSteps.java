package com.pratham;

//  https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NoOfSteps {
    public static void main(String[] args) {

    }

    public int numberOfSteps(int num){
        // creating a helper function
        return helper(num,0);
    }

    public int helper(int num, int steps){
        // base condition, if number becomes zero, return steps you got
        if (num==0){
            return steps;
        }
        // if number is even, divide by 2 & increase step
        if (num%2==0){
            return helper(num/2,steps+1);
        }
        // here, num is odd, subtract by 1 & increase step
        return helper(num-1, steps+1);
    }
}
