
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SkewBinary {

	static void solve() throws Exception {
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
		input.close();

	}

	static int nextInt() throws IOException {
		return parseInt(next());
	}

	static long nextLong() throws IOException {
		return parseLong(next());
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
