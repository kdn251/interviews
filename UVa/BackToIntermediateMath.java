
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class BackToIntermediateMath {

	static void solve() throws Exception {
		int numberOfTestCases = nextInt();
		DecimalFormat formatter = new DecimalFormat("#0.000");
		for (int i = 0; i < numberOfTestCases; i++) {
			double distance = nextDouble();
			double riverSpeed = nextDouble();
			double boatSpeed = nextDouble();
			if (riverSpeed == 0 || boatSpeed == 0 || boatSpeed <= riverSpeed) {
				System.out.println("Case " + (i + 1) + ": can't determine");
			} else {
				double P1 = distance / boatSpeed;
				double P2 = distance
						/ Math.sqrt(boatSpeed * boatSpeed - riverSpeed
								* riverSpeed);
				System.out.print("Case " + (i + 1) + ": "
						+ formatter.format(Math.abs(P1 - P2)) + "\n");
			}
		}
	}

	static int nextInt() throws IOException {
		return parseInt(next());
	}

	static int nextDouble() throws IOException {
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
