// Approach 1: (for loop)
// Better approach to prune unnecessary recursive calls

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        backtrack(1,n,k, new ArrayList<>(), output);
        return output;
    }

    public void backtrack(int start,int n, int k, List<Integer> combo, List<List<Integer>> output){
        if(combo.size() == k)
            output.add(new ArrayList<>(combo));
        else{
            for (int i = start; i <= n - (k - combo.size()) + 1; i++) {
                combo.add(i);
                backtrack(i + 1, n, k, combo, output);
                combo.remove(combo.size() - 1);
            }
        }
    }
}


// Aprroach 2: (include/exclude branch)
// Check for 2 conditions: if individual combination size is k, and if all numbers till n have been iterated
//Time: O(2^n)

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> combo = new ArrayList<>();
        backtrack(1,n,k, combo, output);
        return output;
    }

    public void backtrack(int i,int n, int k, List<Integer> combo, List<List<Integer>> output){
        if(combo.size() == k)
            output.add(new ArrayList<>(combo));
        else if(i > n)
            return;
        else{
            combo.add(i);
            backtrack(i+1,n, k, combo, output);

            combo.remove(combo.size()-1);
            backtrack(i+1,n, k, combo, output);
        }
    }
}