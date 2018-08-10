
//Given an integer array nums, find the contiguous subarray within an array (containing at least one number) 
//which has the largest product.

class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0],min = nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
           if(nums[i]<0){
               int temp = max;
               max = min;
               min = temp;
           }
            max = Math.max(nums[i],max*nums[i]);
            min = Math.min(nums[i],min*nums[i]);
            res = Math.max(res,max);
        }
        return res;
    }
}
