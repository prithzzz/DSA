// Approach: (array 2 pointers)
// Brute force method will have time complexity O(n^3)
// So, sort the array, and assume k=0 and two pointers i=k+1, j=n-1.
// Add nums at i,j,k
// If sum is >0, then move i. If sum is <0 then move j.
// Check if i or k repeat with the adjacent value in array (otherwise will lead to duplicate results)


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>(); 
        Arrays.sort(nums);

        for(int k=0; k<n; k++){
            if(k>0 && nums[k]==nums[k-1])
                continue;
                
            int i=k+1; int j=n-1; 

            while(i<j){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0)
                    j--;
                else if(sum < 0)
                    i++;
                else{
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    i++;

                    while(nums[i] == nums[i-1] && i<j)
                        i++;
                }
            }
        }            
        return result;
    }
}