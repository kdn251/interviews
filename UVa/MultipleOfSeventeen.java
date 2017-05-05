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

public class MultipleOfSeventeen {
	private static final BigInteger BIGINTEGER_FIVE = new BigInteger("5");
	private static final BigInteger BIGINTEGER_SEVENTEEN = new BigInteger("17");
	private static final BigInteger BIGINTEGER_ZERO = new BigInteger("0");

	static void solve() throws Exception {
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
