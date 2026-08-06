// Approach 1: (using HashSet)
// Add all elements to a hashset while calculating min and max values in array. Check if hash set contains each number in the range between min and max.
// Time: O(D+n) //time 'n' for parsing theu array to find min and max, time 'D' for checking if element exists in the hashset formed
// Space:O(n) //for hashset
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


// Approach 2: (using sort)
// Sort the array. Parse thru the array check if each number between the range(min to max values of sorted array) matches element in the array
// Time: O(n.log n + D)
// Space: O(1)
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