// Approach 1: 
// Brute Force: Store (n-1)th element as temp, move all elements to the right and put nums[0] as temp. Continue k times.
// Too long!

// Approach 2: 
// Reverse method: Write reverse function. k = k % n ()
// reverse the entire array, then reverse the (0 to k-1) elements and then reverse (k to n-1) elements. 


class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        
            
        //Brute force:
        // int n = nums.length;
        // int temp=0;
        // for(int i=0; i<k; i++){
        //     temp = nums[n-1];
        //     for(int j=n-1; j>0; j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = temp;
        // }
    }
    public void reverse(int[] nums, int start, int end){
        int temp;
        while(start < end){
            temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}
