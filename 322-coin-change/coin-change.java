// Approach: (Knapsack-type problem)
// Compute the min number of coins required for every amount value from 0 to amount. Initially fill with value(amount+1). 
// Calculate for each amount value-
// dp[i] = min(dp[i], 1+dp[i-c]) 
// where c is each coin in the coins array


class Solution {
    public int coinChange(int[] coins, int amount) {  
        int[] dp = new int[amount+1];   
        dp[0] = 0;
        for(int i=1; i<amount+1; i++){
            dp[i] = amount+1;
        }

        for (int i=1; i<amount+1; i++){
            for(int c : coins){
                if(i-c >= 0)
                    dp[i] = Math.min(dp[i], 1+dp[i-c]);
            }
        }
        if(dp[amount] != amount+1)
            return dp[amount];
        return -1;
    }
}