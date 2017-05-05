import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Parity {

	static void solve() throws Exception {
		while (true) {
			int number = nextInt();
			if (number == 0) {
				break;
			}
			String binaryInString = convertToBinary(number);
			int count = 0;
			for (int i = 0; i < binaryInString.length(); i++) {
				if ("1".equals(binaryInString.charAt(i) + "")) {
					count++;
				}
			}
			System.out.println("The parity of " + binaryInString + " is "
					+ count + " (mod 2).");

		}
	}

	static String convertToBinary(int number) {
		StringBuilder s = new StringBuilder("");
		while (number != 0) {
			s = s.append(number % 2);
			number = number / 2;
		}
		return s.reverse().toString();
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
