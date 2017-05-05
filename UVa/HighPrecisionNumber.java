import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HighPrecisionNumber {

    static void solve() throws Exception {
	Scanner input = new Scanner(System.in);
	int numberOfGroups = input.nextInt();
	while (numberOfGroups != 0) {
	    BigDecimal sum = BigDecimal.ZERO;
	    BigDecimal number = input.nextBigDecimal();
	    while(!number.equals(BigDecimal.ZERO)){
		sum = sum.add(number);
		number = input.nextBigDecimal();
	    }
	    System.out.println(sum.toPlainString().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1"));
	    numberOfGroups--;
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
