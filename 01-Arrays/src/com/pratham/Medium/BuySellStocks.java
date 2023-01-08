//  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

package com.pratham.Medium;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] stocks = {7,6,4,3,1};
        int ans = maxProfit2(stocks);
        System.out.println(ans);
    }

    // Brute: Using 2 nested loops with Time:O(N*N)
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j< prices.length;j++){
                profit = Math.max(profit,prices[j]-prices[i]);
            }
        }
        return profit;
    }

    // Optimized: Using min pointer
    public static int maxProfit2(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            mini = Math.min(mini,prices[i]);
            profit = Math.max(profit,prices[i]-mini);
        }
        return profit;
    }
}
