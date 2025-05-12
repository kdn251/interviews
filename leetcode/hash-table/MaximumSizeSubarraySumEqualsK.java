// Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one, return 0 instead.

// Note:
// The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

// Example 1:
// Given nums = [1, -1, 5, -2, 3], k = 3,
// return 4. (because the subarray [1, -1, 5, -2] sums to 3 and is the longest)

// Example 2:
// Given nums = [-2, -1, 2, 1], k = 1,
// return 2. (because the subarray [-1, 2] sums to 1 and is the longest)

// Follow Up:
// Can you do it in O(n) time?

public class MaximumSizeSubarraySumEqualsK {
    public int maxSubArrayLen(int[] nums, int k) {
        if(nums.length == 0) {
            return 0;
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int maxLength = 0;
        
        int total = 0;
        
        map.put(0, -1);
        
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
            if(map.containsKey(total - k)) {
                maxLength = Math.max(maxLength, i - map.get(total - k));
            }

            if(!map.containsKey(total)) {
                map.put(total, i);
            }
        }
        
        return maxLength;
    }
}
