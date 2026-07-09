// Approach: (Sliding window)
// for every new element, add it into a visited hashmap to along with its index. Check if the elements already exists in the map.
// To check if it exists within given window, use the current index of duplicate element in array and the index of the previous duplicate stored in the hashmap.


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