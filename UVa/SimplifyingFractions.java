/**
 * You are to write a program that reduces a fraction into its lowest terms.
 * Input
 * The first line of the input file gives the number of test cases N (≤ 20). Each of the following N lines
 * contains a fraction in the form of p/q (1 ≤ p, q ≤ 1030).
 * Output
 * For each test case, output the fraction after simplification.
 * Sample Input
 * 4
 * 1 / 2
 * 2 / 4
 * 3 / 3
 * 4 / 2
 * Sample Output
 * 1 / 2
 * 1 / 2
 * 1 / 1
 * 2 / 1
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1755

import java.math.BigInteger;
import java.util.Scanner;

public class SimplifyingFractions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		while (numberOfTestCases != 0) {
			String pAsString = input.next();
			input.next();
			String qAsString = input.next();
			BigInteger p = new BigInteger(pAsString);
			BigInteger q = new BigInteger(qAsString);
			BigInteger greatestCommonDivisor = p.gcd(q);
			if (!greatestCommonDivisor.equals(BigInteger.ONE)) {
				p = p.divide(greatestCommonDivisor);
				q = q.divide(greatestCommonDivisor);
			}
			System.out.println(p + " / " + q);
			numberOfTestCases--;
		}
	}
}
