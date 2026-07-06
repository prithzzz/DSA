// Approach 1: (array 2 pointers)
// Use two pointer i,j to comapre the absolute value of first and last elements (moving inward).
// Place the square of the larger value to the end of result array. Return result array.
// Time complexity - O(n)

// Approach 2: (Brute force)
// Square every element in the array and then sort.
// Time complexity - O(n.log n)


class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i=0; int j=n-1; int k=n-1;
        while(i <= j){
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                result[k] = nums[j] * nums[j];
                j--;
            }
            else{
                result[k] = nums[i] * nums[i];
                i++;
            }
            k--;
        }

        return result;
    }
}