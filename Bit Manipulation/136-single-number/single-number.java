// Approach 1: [Brute Force]
// Will use 2 for loops giving O(n^2) time complexity.

// Approach 2: [Sort array]
// Will still give O(n.log n) time complexity.

// Approach 3: [Hash map]
// Will use 1 for loop so time complexity-O(n) but hashmap will take extra space(not constant)

// Aproach 4: [XOR/Bit manipulation]
// We know, 0 XOR n = n ; n XOR n = 0
// Assume a xor variable, for 1st element 2 XOR 0(xor) = 2, and if we find another duplicate element in array, 2 XOR 2(xor) = 0. 
// So, by returning the xor value, we return either 0 or the value without duplicate.
// Time complexity - O(n) , Space complexity - O(1)


class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums){
            xor = xor^num;
        }
        return xor;
    }
}