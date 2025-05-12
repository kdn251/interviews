//Given an array of integers, every element appears three times except for one, 
//which appears exactly once. Find that single one.

//Note:
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

class SingleNumberII {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        
        for(int key: map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        
        //no unique integer in nums
        return -1;
    }
}
