//Note: This is an extension of House Robber. (security system is tripped if two ajacent houses are robbed)
//After robbing those houses on that street, the thief has found himself a new place for his thievery so that 
//he will not get too much attention. This time, all houses at this place are arranged in a circle. That means 
//the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the 
//same as for those in the previous street.
//Given a list of non-negative integers representing the amount of money of each house, determine the maximum 
//amount of money you can rob tonight without alerting the police.

class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return nums[0];
        }
        
        int[] first = new int[nums.length + 1];
        int[] second = new int[nums.length + 1];
        
        first[0]  = 0;
        first[1]  = nums[0];
        second[0] = 0;
        second[1] = 0;
        
        for (int i = 2; i <= nums.length; i++) {
            first[i] = Math.max(first[i - 1], first[i - 2] + nums[i - 1]);
            second[i] = Math.max(second[i - 1], second[i - 2] + nums[i - 1]);
        }
        
        return Math.max(first[nums.length - 1], second[nums.length]);
    }
}
