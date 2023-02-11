package com.pratham.Easy;
//  https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = getSquare(slow);
            fast = getSquare(getSquare(fast));
        } while(slow!=fast);

        if(slow==1) {
            return true;
        } else{
            return false;
        }
    }

    public int getSquare(int num) {
        int ans = 0;
        while(num>0){
            int rem = num%10;
            ans += rem*rem;
            num /= 10;
        }
        return ans;
    }
}
