
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=524
public class PrimeFactors {

    static void solve() throws Exception {
	int number = nextInt();
	boolean[] isPrime = generatePrimeNumbers();
	while (number != 0) {
	    boolean isNegative = false;
	    if (number < 0) {
		isNegative = true;
		number = (int) Math.abs(number);
	    }
	    int originalNumber = number;
	    List<Integer> primeFactors = new ArrayList<Integer>();
	    int squareRootOfOriginalNumber = (int) Math.sqrt(originalNumber);
	    for (int i = 2; i <= squareRootOfOriginalNumber; i++) {
		if (isPrime[i]) {
		    while (number % i == 0) {
			primeFactors.add(i);
			number = number / i;
		    }
		}
	    }
	    if (number != 1) {
		primeFactors.add(number);
	    }
	    formatOutput(originalNumber, primeFactors, isNegative);
	    number = nextInt();

	}

    }

    static void formatOutput(int number, List<Integer> primeFactors, boolean isNegative) {
	if (isNegative) {
	    number = number * (-1);
	}
	StringBuilder output = new StringBuilder(number + " = ");
	int numberOfPrimeFactors = primeFactors.size();
	if (numberOfPrimeFactors == 1) {
	    if (isNegative) {
		output.append("-1 x " + (number * (-1)));
	    } else {
		output.append(number);
	    }
	} else {
	    Collections.sort(primeFactors);
	    if (isNegative) {
		output.append("-1 x ");
	    }
	    for (int i = 0; i < numberOfPrimeFactors - 1; i++) {
		output.append(primeFactors.get(i) + " x ");
	    }
	    output.append(primeFactors.get(numberOfPrimeFactors - 1));
	}
	System.out.println(output);
    }

    static boolean[] generatePrimeNumbers() {
	int number = (int) Math.sqrt(Integer.MAX_VALUE);
	boolean[] isPrime = new boolean[number + 1];
	for (int i = 2; i < number + 1; i++) {
	    isPrime[i] = true;
	}
	for (int factor = 2; factor * factor < number + 1; factor++) {
	    if (isPrime[factor]) {
		for (int j = factor; j * factor < number + 1; j++) {
		    isPrime[j * factor] = false;
		}
	    }
	}
	return isPrime;
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