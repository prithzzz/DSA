class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int n = nums.length;

        int[] smaller = new int[n];
        smaller[0] = 0;

        for (int i = 1; i < n; i++) {
            if (sorted[i] == sorted[i - 1])
                smaller[i] = smaller[i - 1];
            else
                smaller[i] = i;
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] == sorted[j]) {
                    result[i] = smaller[j];
                    break;
                }
            }
        }

        return result;
    }
}