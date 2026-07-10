class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int min_diff = Integer.MAX_VALUE;

        int i=1;
        while(i<n){
            int diff = Math.abs(arr[i] - arr[i-1]);
            min_diff = Math.min(min_diff, diff);
            i++;
        }

        int k=1;
        while(k<n){
            if(Math.abs(arr[k]-arr[k-1]) == min_diff){
                result.add(Arrays.asList(arr[k-1], arr[k]));
            }
            k++;
        }

        return result;
    }
}