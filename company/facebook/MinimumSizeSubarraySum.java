// Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

// For example, given the array [2,3,1,2,4,3] and s = 7,
// the subarray [4,3] has the minimal length under the problem constraint.

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int i = 0;
        int j = 0;
        int result = Integer.MAX_VALUE;
        int total = 0;
        
        while(i < nums.length) {
            total += nums[i++];
            
            while(total >= s) {
                result = Math.min(result, i - j);
                total -= nums[j++];
            }
        }
        
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
