
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AddingReversedNumbers {

	static void solve() throws Exception {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		while (numberOfTestCases != 0) {
			BigInteger first = input.nextBigInteger();
			BigInteger second = input.nextBigInteger();
			StringBuilder firstString = new StringBuilder(first + "");
			StringBuilder secondString = new StringBuilder(second + "");
			BigInteger firstReversed = new BigInteger(firstString.reverse()
					.toString());
			BigInteger secondReversed = new BigInteger(secondString.reverse()
					.toString());
			BigInteger result = firstReversed.add(secondReversed);
			String resultReversed = new StringBuilder(result + "").reverse()
					.toString();
			System.out.println(resultReversed.replaceFirst("^0*", ""));
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
