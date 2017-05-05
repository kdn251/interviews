
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GoldbachConjecture {

	static void solve() throws Exception {
		boolean[] isPrime = generatePrimeNumbers(1000000);
		int number = nextInt();
		while (number != 0) {
			boolean found = false;
			for (int i = 3; i < number && !found; i++) {
				if (isPrime[i]) {
					int currentPrime = i;
					int j = number - currentPrime;
					if (isPrime[j]) {
						System.out.println(number + " = " + currentPrime
								+ " + " + j);
						found = true;
					}
				}
			}
			if (!found) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
			number = nextInt();
		}
	}

	static boolean[] generatePrimeNumbers(int number) {
		boolean[] isPrime = new boolean[number + 1];
		for (int i = 2; i < number + 1; i++) {
			isPrime[i] = true;
		}

		for (int factor = 2; factor * factor <= number; factor++) {
			if (isPrime[factor]) {
				for (int j = factor; factor * j <= number; j++) {
					isPrime[factor * j] = false;
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
