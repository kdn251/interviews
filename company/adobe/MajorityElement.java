//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//You may assume that the array is non-empty and the majority element always exist in the array.

class MajorityElement {
    public int majorityElement(int[] nums) {
        // if(nums.length == 1) {
        //     return nums[0];
        // }
        
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for(int current: nums) {
        //     if(map.containsKey(current) && map.get(current) + 1 > nums.length / 2) {
        //         return current;
        //     } else if(map.containsKey(current)) {
        //         map.put(current, map.get(current) + 1);
        //     } else {
        //         map.put(current, 1);
        //     }
        // }
        
        // //no majority element exists
        // return -1;
        // Here is your Brutofocre solution also check this out
         if(nums.length == 1){
            return 1;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                count++;
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }
}
