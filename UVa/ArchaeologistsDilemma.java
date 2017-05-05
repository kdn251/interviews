
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ArchaeologistsDilemma {

    public static final boolean DEBUG = true;
    public static final boolean DEBUG_INPUT = true;

    final static double LOG2 = Math.log(2.0);
    final static double LOG2_10 = Math.log(10) / LOG2;

    public static void solve() throws IOException {
	while (true) {
	    long N = nextLong();
	    int k = (N + "").length() + 1;

	    long lowerBound = (long) ((Math.log(N) / LOG2) + k * LOG2_10);
	    long upperBound = (long) ((Math.log(N + 1) / LOG2) + k * LOG2_10);

	    while (lowerBound == upperBound) {
		k++;
		lowerBound = (long) ((Math.log(N) / LOG2) + k * LOG2_10);
		upperBound = (long) ((Math.log(N + 1) / LOG2) + k * LOG2_10);
	    }

	    System.out.println(upperBound);
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
