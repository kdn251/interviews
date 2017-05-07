/**
 * Most of the times, the students of Computer Science & Engineering of BUET deal with bogus, tough and
 * very complex formulae. That is why, sometimes, even for a easy problem they think very hard and make
 * the problem much complex to solve. But, the team members of the team “BUET PESSIMISTIC”
 * are the only exceptions. Just like the opposite manner, they treat every hard problem as easy and so
 * cannot do well in any contest. Today, they try to solve a series but fail for treating it as hard. Let
 * them help.
 * Input
 * Just try to determine the answer for the following series
 * ∑ 
 * N
 * i=1
 * iAi
 * You are given the value of integers N and A (1 ≤ N ≤ 150, 0 ≤ A ≤ 15).
 * Output
 * For each line of the input, your correct program should output the integer value of the sum in separate
 * lines for each pair of values of N and A.
 * Sample Input
 * 3 3
 * 4 4
 * Sample Output
 * 102
 * 1252
 */


import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class VeryEasy {

	static void solve() throws Exception {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			BigInteger sum = BigInteger.ZERO;
			int N = input.nextInt();
			int A = input.nextInt();
			BigInteger aAsBigInteger = BigInteger.valueOf(A);
			BigInteger product = BigInteger.ONE;
			for (int i = 1; i < N + 1; i++) {
				product = BigInteger.valueOf(i).multiply(aAsBigInteger.pow(i));
				sum = sum.add(product);
			}
			System.out.println(sum);
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
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new OutputStreamWriter(System.out));
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(0);
		}
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;
}
