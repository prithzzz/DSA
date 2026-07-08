class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int count = 0;
        int l; int r;
        
        for(int i=1; i<n-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                l = i; r = i;

                while(l>0 && arr[l-1] < arr[l])
                    l--;
                while(r<n-1 && arr[r] > arr[r+1])
                    r++;

                count = Math.max(r-l+1, count);
            }
        }

        return count;
    }
}