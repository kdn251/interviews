
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LargestPrimeDivisor {

	static void solve() throws Exception {
		long number = nextLong();
		while (number != 0) {
			number = (long) (Math.abs(number));
			long largestPrimeDivisor = -1;
			int numberOfPrimeDivisors = 0;
			int sqrtOfNumber = (int) (Math.sqrt(number));
			for (int i = 2; i <= sqrtOfNumber; i++) {
				if (number % i == 0) {
					numberOfPrimeDivisors++;
					largestPrimeDivisor = i;
					while (number % i == 0) {
						number = number / i;
					}
				}
			}
			if (largestPrimeDivisor != -1 && number != 1) {
				System.out.println(number);
			} else if (numberOfPrimeDivisors <= 1) {
				System.out.println(-1);
			} else {
				System.out.println(largestPrimeDivisor);
			}
			number = nextLong();
		}
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
