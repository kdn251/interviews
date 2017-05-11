/**
 * One of the first users of BIT’s new supercomputer was Chip Diller. He extended his exploration of
 * powers of 3 to go from 0 to 333 and he explored taking various sums of those numbers.
 * “This supercomputer is great,” remarked Chip. “I only wish Timothy were here to see these results.”
 * (Chip moved to a new apartment, once one became available on the third floor of the Lemon Sky
 * apartments on Third Street.)
 * Input
 * The input will consist of at most 100 lines of text, each of which contains a single VeryLongInteger.
 * Each VeryLongInteger will be 100 or fewer characters in length, and will only contain digits (no
 * VeryLongInteger will be negative).
 * The final input line will contain a single zero on a line by itself.
 * Output
 * Your program should output the sum of the VeryLongIntegers given in the input.
 * Sample Input
 * 123456789012345678901234567890
 * 123456789012345678901234567890
 * 123456789012345678901234567890
 * 0
 * Sample Output
 * 370370367037037036703703703670
 */


//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=&problem=365

import java.math.BigInteger;
import java.util.Scanner;

public class IntegerInquiry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger sum = BigInteger.ZERO;
		while (true) {
			BigInteger number = input.nextBigInteger();
			if (number.equals(BigInteger.ZERO)) {
				break;
			}
			sum = sum.add(number);
		}
		System.out.println(sum);
	}
}
