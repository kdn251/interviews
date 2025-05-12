// Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

// For example,
// Given [100, 4, 200, 1, 3, 2],
// The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

// Your algorithm should run in O(n) complexity.

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        for(int n: nums) {
            set.add(n);
        }
        
        int maxLength = 0;
        for(int n: set) {
            if(!set.contains(n - 1)) {
                int current = n;
                int currentMax = 1;
                
                while(set.contains(n + 1)) {
                    currentMax++;
                    n++;
                }
                
                maxLength = Math.max(maxLength, currentMax);
            }
        }
        
        return maxLength;
    }
}
