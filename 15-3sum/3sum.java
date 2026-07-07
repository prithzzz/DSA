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