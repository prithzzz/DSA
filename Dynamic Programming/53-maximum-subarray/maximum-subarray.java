/*Approach 1: (Dynamic Programming)
For each element in the given array, the subarray with max sum will either be the current value or the prev subarray+current value.
And the max sum at each num[i] will be stored at a dp array. The max sum in the dp array is the final answer.
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
        }

        int max_sum = dp[0];
        for(int i=1; i<dp.length; i++){
            max_sum = Math.max(max_sum, dp[i]);
        }

        return max_sum;
    }
}


/*Approach 2: (Brute force) 
Use a recursive function to calculate the sum of arrays while increasing the start count of each subarray.
*/

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max_sum = nums[0];
//         max_sum = maxValue(nums, max_sum, 0);
//         return max_sum;
//     }

//     public int maxValue(int[] nums, int max_value, int count) {
//         int sum = 0; 
//         for(int i=count; i<nums.length; i++){
//             sum = sum + nums[i];
//             max_value = Math.max(max_value, sum);
//         }

//         count++;
//         if(count<nums.length)
//             max_value = maxValue(nums, max_value, count);

//         return max_value;
//     }
// }