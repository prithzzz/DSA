// Approach: (array 2 pointers)
// Start with the element at index i=1, and find i such that left and right elements are less than i.
// Then iterate pointer l such that all elements to its left are lesser and interate pointer r such that all elements to its right are lesser.
// Find r-l+1 and compare with prev count to find the max length of the mountain.


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