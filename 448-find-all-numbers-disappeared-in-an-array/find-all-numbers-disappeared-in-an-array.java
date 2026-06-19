class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        Set<Integer> s_nums = new HashSet<>(); 
        for(int i=0; i<n; i++){
            s_nums.add(nums[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i=1; i<=n; i++){
            if (!s_nums.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}