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
