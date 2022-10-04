package com.pratham;

public class FindBit {
    public static void main(String[] args) {
        // find ith bit of a given number
        int num = 14;
        int ans = findIth(num,3);
        System.out.println(ans);
    }

    static int findIth(int num, int pos){
        int ans = num & 1<<pos-1;
        return ans >> pos-1;
    }

}
