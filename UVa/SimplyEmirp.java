
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

public class SimplyEmirp {

    static void solve() throws Exception {
	Scanner input = new Scanner(System.in);
	while (input.hasNext()) {
	    String inputGiven = input.next();
	    BigInteger number = new BigInteger(inputGiven);
	    if (!number.isProbablePrime(10)) {
		System.out.println(number + " is not prime.");
	    } else {
		String numberReversedAsString = new StringBuilder(number.toString()).reverse().toString();
		BigInteger numberReversed = new BigInteger(numberReversedAsString);
		if(numberReversed.isProbablePrime(10) && numberReversed.compareTo(number) != 0){
		    System.out.println(number +" is emirp.");
		} else {
		    System.out.println(number +" is prime.");
		}
	    }
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
