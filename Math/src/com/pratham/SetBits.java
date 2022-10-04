package com.pratham;

public class SetBits {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(setBit(num, 1));
    }

    static int setBit(int num, int pos) {
        int ans = num | (1 << pos - 1);
        return ans;
    }
}
