
/**
 * Given a base b and two non-negative base b integers
 * p and m, compute p mod m and print the
 * result as a base-b integer. p mod m is defined
 * as the smallest non-negative integer k such that
 * p = a ∗ m + k for some integer a.
 * Input
 * Input consists of a number of cases. Each case is
 * represented by a line containing three unsigned
 * integers. The first, b, is a decimal number between
 * 2 and 10. The second, p, contains up to 1000 digits between 0 and b − 1. The third, m, contains
 * up to 9 digits between 0 and b − 1. The last case is followed by a line containing ‘0’.
 * Output
 * For each test case, print a line giving p mod m as a base-b integer.
 * Sample Input
 * 2 1100 101
 * 10 123456789123456789123456789 1000
 * 0
 * Sample Output
 * 10
 * 789
 *
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1492

import java.math.BigInteger;
import java.util.Scanner;

public class BasicRemains {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int baseNumber = input.nextInt();
			if (baseNumber == 0) {
				break;
			}
			BigInteger p = new BigInteger(input.next(), baseNumber);
			BigInteger m = new BigInteger(input.next(), baseNumber);
			System.out.println((p.mod(m)).toString(baseNumber));
		}
	}
}