import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CoconutsRevisited {

	static void solve() throws Exception {
		int i, rez, j;
		boolean isValid;
		while (true) {
			isValid = false;
			int num = nextInt();
			if (num == -1) {
				break;
			}
			for (i = (int) (Math.sqrt(num) + 1); i > 1; i--) {
				rez = num;
				for (j = 0; j < i && rez % i == 1; j++) {
					rez = rez - rez / i - 1;
				}
				if (rez % i == 0 && i == j) {
					isValid = true;
					break;
				}
			}
			if (isValid) {
				System.out.println(num + " coconuts, " + i
						+ " people and 1 monkey");
			} else {
				System.out.println(num + " coconuts, no solution");
			}
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
