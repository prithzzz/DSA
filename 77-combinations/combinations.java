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