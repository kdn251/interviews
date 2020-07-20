//Given an array of size n, find the majority element. The majority element is the element that appears more than âŒŠ n/2 âŒ‹ times.
//You may assume that the array is non-empty and the majority element always exist in the array.
class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int current: nums) {
            if(map.containsKey(current) && map.get(current) + 1 > nums.length / 2) {
                return current;
            } else if(map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }
        
        //no majority element exists
        return -1;
    }
    public void printMajority(int a[], int size) 
    {       
        int cand = findCandidate(a, size);/* Finding the candidate for Majority*/       
        if (isMajority(a, size, cand)) /* Printing the candidate if it is Majority*/
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }
     /* Function to find the candidate for Majority. This works by assuming 0th element to be correct and cancellinng it out
    when a different number is found, and assuming the next element to be correct in turn. If an element is Majority element, it 
    will be left even after all cancellations*/
    private int findCandidate(int a[], int size) 
    {
        int possibleIndex = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) 
        {
            if (a[possibleIndex] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                possibleIndex = i;
                count = 1;
            }
        }
        return a[possibleIndex];
    }
 
    /* Function to check if the candidate occurs more than n/2 times, as the last element in odd length array with all different elements is left out.
    Other cases exist too.*/
    private boolean isMajority(int a[], int size, int cand) 
    {
        int i, count = 0;
        for (i = 0; i < size; i++) 
        {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2) 
            return true;
        else
            return false;
    }
 
}
