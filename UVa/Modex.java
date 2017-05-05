/**
 * Many well-known cryptographic operations require modular exponentiation. That is, given integers x,
 * y and n, compute x
 * y mod n. In this question, you are tasked to program an efficient way to execute
 * this calculation.
 * Input
 * The input consists of a line containing the number c of datasets, followed by c datasets, followed by a
 * line containing the number ‘0’.
 * Each dataset consists of a single line containing three positive integers, x, y, and n, separated by
 * blanks. You can assume that 1 < x, n < 2
 * 15 = 32768, and 0 < y < 2
 * 31 = 2147483648.
 * Output
 * The output consists of one line for each dataset. The i-th line contains a single positive integer z such
 * that
 * z = x
 * y mod n
 * for the numbers x, y, z given in the i-th input dataset.
 * Sample Input
 * 2
 * 2 3 5
 * 2 2147483647 13
 * 0
 * Sample Output
 * 3
 * 11
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3671

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

public class Modex {

    static void solve() throws Exception {
	Scanner input = new Scanner(System.in);
	int numberOfTestCases = input.nextInt();
	while (numberOfTestCases != 0) {
	    BigInteger x = input.nextBigInteger();
	    BigInteger y = input.nextBigInteger();
	    BigInteger n = input.nextBigInteger();
	    BigInteger result = x.modPow(y, n);
	    System.out.println(result);
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
