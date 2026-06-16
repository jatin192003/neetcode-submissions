class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[k];
        boolean[] used = new boolean[n];

        for (int r = 0; r < k; r++) {

            int maxFreq = 0;
            int maxNum = 0;

            for (int i = 0; i < n; i++) {

                if (used[i]) continue;

                int freq = 0;

                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        freq++;
                    }
                }

                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxNum = nums[i];
                }
            }

            result[r] = maxNum;

            for (int i = 0; i < n; i++) {
                if (nums[i] == maxNum) {
                    used[i] = true;
                }
            }
        }

        return result;
    }
}
