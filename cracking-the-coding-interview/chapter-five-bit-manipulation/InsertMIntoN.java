/* you are given two 32-bit numbers, N and M, are two bit positions, i and j. Write
 * a method to insert M into N such that M starts at bit j and ends at bit i. You can
 * assume that the bits j through i have enough space to fit all of M. That is, if M = 10011,
 * you can assume that there are at least 5 bits between j and i. You would not, for example,
 * have j = 3 and i = 2, because M could not fully bit between bit 3 and bit 2.
 EXAMPLE:
 Input: N = 10000000000, m = 10011, i = 2, j = 6
 Output: N = 10001001100 */

 public class InsertMIntoN {
 	int updateBits(int n, int m, int i, int j) {
 		/* create a mask to clear bits i through j in n
 		 * EXAMPLE: i = 2, j = 4. Result should be 11100011.
 		 * For simplicity, we'll just use 8 bits for the example.
 		 */
 		int allones = ~0; //wil equal sequence of all 1s

 		//1s before position j, then 0s. Left = 11100000
 		int left = allOnes << (j + 1);

 		//1s after position i. Right = 00000011
 		int right = ((1 << i) - 1);

 		//all 1s, except for 0s between i and j. Mask = 11100011
 		int mask = left | right;

 		/* clear bits j through i then put m in there */
 		int n_cleared = n & mask; //clear bits j through i
 		int m_shifted = m << i; //move m into correct position

 		return n_cleared | m_shifted; //OR them, and we're done!
 	}
 }