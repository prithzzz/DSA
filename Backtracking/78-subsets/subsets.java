// Approach: (Backtracking)
// For every element has two paths- add to subset(append) or not add to subset(pop)
// Time complexity: O(n.2^n)


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        backtrack(nums, 0, subset, result);
        return result;
    }

    public void backtrack(int[] nums, int i, List<Integer> subset, List<List<Integer>> result){

        if(i >= nums.length)
            result.add(new ArrayList<>(subset));
        else{
            subset.add(nums[i]);
            backtrack(nums, i+1, subset, result);
            subset.remove(subset.size() - 1);
            backtrack(nums, i+1, subset, result);
        }       
    }
}