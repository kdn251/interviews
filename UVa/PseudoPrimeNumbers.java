
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class PseudoPrimeNumbers {

    static void solve() throws Exception {
	while(true){
	    int p = nextInt();
	    int a = nextInt();
	    if(a== 0 && p == 0){
		break;
	    }
	    BigInteger pAsBigInteger = new BigInteger(p+"");
	    BigInteger aAsBigInteger = new BigInteger(a+"");
	    String answer = "";
	    if(!pAsBigInteger.isProbablePrime(10)){
		BigInteger result = aAsBigInteger.modPow(pAsBigInteger, pAsBigInteger);
		if(result.equals(aAsBigInteger)){
		    answer = "yes";
		} else {
		    answer = "no";
		}
	    } else {
		answer = "no";
	    }
	    System.out.println(answer);
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
