

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SolveEquation {

    static void solve() throws Exception {

	int numberOfTestCases = nextInt();
	while (numberOfTestCases != 0) {

	    int A = nextInt();
	    int B = nextInt();
	    int C = nextInt();
	    boolean hasSolution = false;

	    for (int x = -22; x <= 22 && !hasSolution; x++) {
		if (x * x <= C) {
		    for (int y = -100; y <= 100 && !hasSolution; y++) {
			if (x!= y && y * y <= C && (x * x + y * y <= C)) {
			    int z = A - x - y;
			    if ((z != y && z != x && x * x + y * y + z * z == C) && x * y * z == B) {
				hasSolution = true;
				System.out.println(x + " " + y + " " + z);
			    }
			}
		    }
		}
	    }
	    if (!hasSolution) {
		System.out.println("No solution.");
	    }

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
