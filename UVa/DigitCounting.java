
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DigitCounting {

	static void solve() throws Exception {
		int numberOfTestCases = nextInt();
		while (numberOfTestCases != 0) {
			int[] numbers = new int[10];
			int number = nextInt();
			for (int i = number; i > 0; i--) {
				int j = i;
				while (j != 0) {
					numbers[j % 10]++;
					j = j / 10;
				}
			}
			for (int i = 0; i < 10; i++) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(numbers[i]);
			}
			System.out.println();
			numberOfTestCases--;
		}
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
