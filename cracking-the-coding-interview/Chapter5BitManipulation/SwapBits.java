/* write a program to swap odd and even bits in an integer with as few instructions as
 * possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on) */

public class SwapBits {
	public int swapOddEvenBits(int x) {
		return ( ((x & 0xaaaaaaaa) >> 1) | ((x & 0x55555555) << 1) );
	}
}