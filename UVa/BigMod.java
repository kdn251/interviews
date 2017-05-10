//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=727&page=show_problem&problem=310
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


public class BigMod {

    static void solve() throws Exception {
	Scanner input = new Scanner(System.in);
	while(input.hasNext()){
	    BigInteger b = input.nextBigInteger();
	    BigInteger p = input.nextBigInteger();
	    BigInteger m = input.nextBigInteger();
	    System.out.println(b.modPow(p, m));
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
