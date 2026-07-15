// Approach: (Fibonacci-type problem)
// For stairs n=0/1/2, the number of ways is always constant. 
// For n>=3, the pattern for number of ways is similar to fibonacci series, hence use fibonacci dp formula. Refer img.


class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1; 
        
        if(n >= 2){
            dp[2] = 2;
            for(int i=3; i<n+1; i++)
                dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
}