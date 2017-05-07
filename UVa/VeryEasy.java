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
