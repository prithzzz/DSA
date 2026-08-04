class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> output = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        int min_num = Integer.MAX_VALUE; 
        int max_num = Integer.MIN_VALUE; 
        for(int x : nums){
            st.add(x);
            min_num = Math.min(min_num, x);
            max_num = Math.max(max_num, x);
        }

        for(int i=min_num; i<max_num; i++){
            if(!st.contains(i))
                output.add(i);
        }

        return output;
    }
}