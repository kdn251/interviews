package mathematics.adHoc.simpler;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class NumberingRoads {

    static void solve() throws Exception {
	int caseNumber = 1;
	while (true) {
	    int first = nextInt();
	    int second = nextInt();
	    if (first == 0 && second == 0) {
		break;
	    }
	    boolean found = false;
	    for (int i = 0; i < 27 && !found; i++) {
		int sum = second + second * i;
		if (sum >= first) {
		    System.out.print("Case " + caseNumber + ": " + i + "\n");
		    found = true;
		}
	    }
	    if (!found) {
		System.out.print("Case " + caseNumber + ": impossible\n");
	    }
	    caseNumber = caseNumber + 1;
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
