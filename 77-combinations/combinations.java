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