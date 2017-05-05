
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MischievousChildren {

	static void solve() throws Exception {
		int numberOfCases = nextInt();
		int currentCase = 1;
		while (numberOfCases != 0) {
			String line = next();
			int numberOfLetters = line.length();
			Map<Character, Integer> letterCounter = new HashMap<Character, Integer>();

			for (int i = 0; i < numberOfLetters; i++) {
				char c = line.charAt(i);
				if (letterCounter.containsKey(c)) {
					int previousOccurrences = letterCounter.get(c);
					letterCounter.replace(c, previousOccurrences + 1);
				} else {
					letterCounter.put(c, 1);
				}
			}
			String lineWithoutDuplicates = "";
			for (int i = 0; i < numberOfLetters; i++) {
				char c = line.charAt(i);
				if (!lineWithoutDuplicates.contains(c + "")) {
					lineWithoutDuplicates = lineWithoutDuplicates + c;
				}
			}
			long nFactorial = computeFactorial(numberOfLetters);
			for (int i = 0; i < letterCounter.size(); i++) {
				char c = lineWithoutDuplicates.charAt(i);
				int numberOfOccurrences = letterCounter.get(c);
				if (numberOfOccurrences != 1) {
					long currentProduct = computeFactorial(numberOfOccurrences);
					nFactorial = nFactorial / currentProduct;
				}
			}
			System.out.println("Data set " + currentCase + ": " + nFactorial);
			currentCase++;
			numberOfCases--;
		}
	}

	static long computeFactorial(int number) {
		long product = 1;
		for (int i = 2; i < number + 1; i++) {
			product = product * i;
		}
		return product;
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
