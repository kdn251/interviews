
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TheHugeOne {

    static void solve() throws Exception {
	Scanner input = new Scanner(System.in);
	int numberOfTestCases = input.nextInt();
	while (numberOfTestCases != 0) {
	    BigInteger M = input.nextBigInteger();
	    input.nextLine();
	    String[] elementsLine = input.nextLine().split(" ");
	    boolean found = false;
	    for (int i = 1; i < elementsLine.length; i++) {
		BigInteger number = new BigInteger(elementsLine[i]);
		if (!M.mod(number).equals(BigInteger.ZERO)) {
		    System.out.println(M + " - Simple.");
		    found = true;
		    break;
		}
	    }
	    if (!found) {
		System.out.println(M + " - Wonderful.");
	    }
	    numberOfTestCases--;
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
	    solve();
	} catch (Throwable e) {
	    e.printStackTrace();
	    exit(0);
	}
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
}
