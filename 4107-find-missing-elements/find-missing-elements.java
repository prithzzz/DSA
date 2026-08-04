class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<Integer> contain = new ArrayList<>();
        int min_num = Integer.MAX_VALUE; 
        int max_num = Integer.MIN_VALUE; 
        for(int x : nums){
            contain.add(x);
            min_num = Math.min(min_num, x);
            max_num = Math.max(max_num, x);
        }

        for(int i=min_num; i<max_num; i++){
            if(!contain.contains(i))
                output.add(i);
        }

        return output;
    }
}