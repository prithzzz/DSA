// Approach:
// Parse through array and if value is equal to the value+1, then use another loop to move all numbers greater then value to the left. Then reduce the length of array.
// Before moving to next value, check if there are any more duplicate values.

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i < n-1){
            if(nums[i] == nums[i+1]){
                for(int j=i+1; j<n-1; j++){
                    nums[j] = nums[j+1];  
                }
                n--;
            }
            if(nums[i] != nums[i+1]){
                i++; }
        }
        return n;
    }
}
