//Given an integer, write a function to determine if it is a power of two.
//
//Example 1:
//
//Input: 1
//Output: true
//Example 2:
//
//Input: 16
//Output: true
//Example 3:
//
//Input: 218
//Output: false

class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        long i = 1;
        while(i < n) {
            i <<= 1;
        }
        
        return i == n;
    }
}
