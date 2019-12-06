/**
 * When a number is expressed in decimal, the k-th digit represents a multiple of 10k. (Digits are numbered
 * from right to left, where the least significant digit is number 0.) For example,
 * 8130710 = 8 × 104 + 1 × 103 + 3 × 102 + 0 × 101 + 7 × 100 = 80000 + 1000 + 300 + 0 + 7 = 81307.
 * When a number is expressed in binary, the k-th digit represents a multiple of 2
 * k. For example,
 * 100112 = 1 × 2
 * 4 + 0 × 2
 * 3 + 0 × 2
 * 2 + 1 × 2
 * 1 + 1 × 2
 * 0 = 16 + 0 + 0 + 2 + 1 = 19.
 * In skew binary, the k-th digit represents a multiple of 2
 * k+1 − 1. The only possible digits are 0
 * and 1, except that the least-significant nonzero digit can be a 2. For example,
 * 10120skew = 1×(25 −1)+ 0×(24 −1)+ 1×(23 −1)+ 2×(22 −1)+ 0×(21 −1) = 31+ 0+ 7+ 6+ 0 = 44.
 * The first 10 numbers in skew binary are 0, 1, 2, 10, 11, 12, 20, 100, 101, and 102. (Skew binary is
 * useful in some applications because it is possible to add 1 with at most one carry. However, this has
 * nothing to do with the current problem.)
 * Input
 * The input file contains one or more lines, each of which contains an integer n. If n = 0 it signals the
 * end of the input, and otherwise n is a nonnegative integer in skew binary.
 * Output
 * For each number, output the decimal equivalent. The decimal value of n will be at most 2
 * 31 − 1 =
 * 2147483647.
 * Sample Input
 * 10120
 * 200000000000000000000000000000
 * 10
 * 1000000000000000000000000000000
 * 11
 * 100
 * 11111000001110000101101102000
 * 0
 * Sample Output
 * 44
 * 2147483646
 * 3
 * 2147483647
 * 4
 * 7
 * 1041110737
 */
//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=516

import java.math.BigInteger;
import java.util.Scanner;

public class SkewBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			BigInteger number = input.nextBigInteger();
			if (number.equals(BigInteger.ZERO)) {
				break;
			}
			int length = (number + "").length();
			BigInteger sum = BigInteger.ZERO;
			for (int i = 0; i < length; i++) {
				BigInteger mod10 = number.mod(BigInteger.TEN);
				BigInteger insideBrackets = BigInteger.valueOf((long) (Math
						.pow(2, i + 1) - 1));
				sum = sum.add((mod10).multiply(insideBrackets));
				number = number.divide(BigInteger.TEN);
			}
			System.out.println(sum);
		}
	}
}
