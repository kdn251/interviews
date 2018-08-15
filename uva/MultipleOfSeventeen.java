/**
 * Theorem: If you drop the last digit d of an integer n (n ≥ 10), subtract 5d from the
 * remaining integer, then the difference is a multiple of 17 if and only if n is a multiple of 17.
 * For example, 34 is a multiple of 17, because 3-20=-17 is a multiple of 17; 201 is not a multiple of
 * 17, because 20-5=15 is not a multiple of 17.
 * Given a positive integer n, your task is to determine whether it is a multiple of 17.
 * Input
 * There will be at most 10 test cases, each containing a single line with an integer n (1 ≤ n ≤ 10100).
 * The input terminates with n = 0, which should not be processed.
 * Output
 * For each case, print 1 if the corresponding integer is a multiple of 17, print 0 otherwise.
 * Sample Input
 * 34
 * 201
 * 2098765413
 * 1717171717171717171717171717171717171717171717171718
 * 0
 * Sample Output
 * 1
 * 0
 * 1
 * 0
 */

//https://uva.onlinejudge.org/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=&problem=3001

import java.math.BigInteger;
import java.util.Scanner;

public class MultipleOfSeventeen {
	private static final BigInteger BIGINTEGER_FIVE = new BigInteger("5");
	private static final BigInteger BIGINTEGER_SEVENTEEN = new BigInteger("17");
	private static final BigInteger BIGINTEGER_ZERO = new BigInteger("0");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			BigInteger number = input.nextBigInteger();
			if (number.equals(BIGINTEGER_ZERO)) {
				break;
			}
			BigInteger lastDigit = number.mod(BigInteger.TEN);
			number = number.divide(BigInteger.TEN);
			BigInteger product5D = lastDigit.multiply(BIGINTEGER_FIVE);
			BigInteger difference = number.subtract(product5D);
			if (difference.mod(BIGINTEGER_SEVENTEEN).equals(BIGINTEGER_ZERO)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
}
