// Implement int sqrt(int x).

// Compute and return the square root of x.

public class Solution {
    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        
        int left = 1;
        int right = x;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(mid == x / mid) {
                return mid;
            } else if(mid > x / mid) {
                right = mid - 1;
            } else if(mid < x / mid) {
                left = mid + 1;
            }
        }
        
        return right;
    }
}
