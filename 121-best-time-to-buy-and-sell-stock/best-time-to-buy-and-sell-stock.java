class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = 0; int sell = 1;
        int profit = 0;
        while(buy<n && sell<n){
            if(prices[buy] < prices[sell]){
                profit = Math.max(profit, prices[sell]-prices[buy]);
            }
            else
                buy = sell;
            sell++;
        }
        return profit;
    }
}