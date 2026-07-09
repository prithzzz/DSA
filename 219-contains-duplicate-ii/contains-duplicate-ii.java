class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> visited = new HashMap<>();

        for(int i=0; i<n; i++){
            if(visited.containsKey(nums[i])){
                if(i-visited.get(nums[i]) <= k)
                    return true;
            }
                
            visited.put(nums[i], i);
        }     
        return false; 
    }
}