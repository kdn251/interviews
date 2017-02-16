// Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

// For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
// the contiguous subarray [4,-1,2,1] has the largest sum = 6.

public class Solution {

    public int maxSubArray(int[] nums) {
        
        int[] dp = new int[nums.length];
        
        dp[0] = nums[0];
        
        int max = dp[0];
        
        for(int i = 1; i < nums.length; i++) {
            
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            
            max = Math.max(dp[i], max);
            
        }
        
        return max;
        
    }

}