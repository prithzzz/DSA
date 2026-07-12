// Approach: (sliding window)
// Sort the array and calculate the min abs diff using loops.
// Use another loop to find all pairs having tht min diff.


class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int min_diff = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            int diff = Math.abs(arr[i] - arr[i-1]);
            min_diff = Math.min(min_diff, diff);
        }

        for(int k=1; k<n; k++){
            if(Math.abs(arr[k]-arr[k-1]) == min_diff)
                result.add(Arrays.asList(arr[k-1], arr[k]));
        }

        return result;
    }
}