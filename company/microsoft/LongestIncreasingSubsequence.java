//Given an unsorted array of integers, find the length of longest increasing subsequence.

//For example,
//Given [10, 9, 2, 5, 3, 7, 101, 18],
//The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

//Your algorithm should run in O(n2) complexity.

//Follow up: Could you improve it to O(n log n) time complexity?

class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = 1;
        
        int max = 1;
        for(int i = 1; i < dp.length; i++) {
            int currentMax = 0;
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    currentMax = Math.max(currentMax, dp[j]);
                }
            }
            dp[i] = 1 + currentMax;
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
