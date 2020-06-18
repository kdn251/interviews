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

@Test
    public void test1() {
        assertEquals(0, Solution.mySqrt(0));
    }

    @Test
       public void test2() {
        assertEquals(2, Solution.mySqrt(4));
    }

    @Test
      public void test3() {
        assertEquals(3, Solution.mySqrt(9));
    }

    @Test
      public void test4() {
        assertEquals(8, Solution.mySqrt(64)));
    }
