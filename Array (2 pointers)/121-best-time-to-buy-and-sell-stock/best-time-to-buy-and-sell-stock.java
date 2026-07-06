// Approach: (array 2 pointers)
// Assume 2 index pointer buy=0 and sell=1. Compare if sell price is greater than buy price, then find profit and compare with the existing max profit.
// Else if ant sell price is lesser than buy price, then that sell becomes the new buy price.


class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = 0; int sell = 1;
        int profit = 0;
        while(buy<n && sell<n){
            if(prices[buy] < prices[sell])
                profit = Math.max(profit, prices[sell]-prices[buy]);
            else
                buy = sell;
                
            sell++;
        }
        return profit;
    }
}