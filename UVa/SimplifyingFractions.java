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

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SimplifyingFractions {

	static void solve() throws Exception {
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
		input.close();
	}

	static int nextInt() throws IOException {
		return parseInt(next());
	}

	static String next() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	public static void main(String[] args) {
		try {
			solve();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(0);
		}
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;
}
