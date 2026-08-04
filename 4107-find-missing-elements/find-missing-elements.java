class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> output = new ArrayList<>();
        Arrays.sort(nums); //[1,2,4,5]
        int min_num = nums[0]; //1
        int max_num = nums[nums.length - 1]; //5

        int i=min_num; int k=0;
        while(k<nums.length){
            if(i != nums[k])
                output.add(i);
            else
                k++;
            i++;
        }

        return output;
    }
}