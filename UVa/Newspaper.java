
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2315
public class Newspaper {

	static void solve() throws Exception {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		while (numberOfTestCases != 0) {
			Map<String, Integer> values = new HashMap<String, Integer>();
			int numberOfValuableCharacters = input.nextInt();
			while (numberOfValuableCharacters != 0) {
				values.put(input.next(), input.nextInt());
				numberOfValuableCharacters--;
			}
			int numberOfLines = input.nextInt();
			input.nextLine();
			double sum = 0;
			while (numberOfLines != 0) {
				String textAsString = input.nextLine();
				for (int i = 0; i < textAsString.length(); i++) {
					String c = textAsString.charAt(i) + "";
					if (values.containsKey(c)) {
						sum = sum + values.get(c);
					}
				}
				numberOfLines--;
			}
			sum = sum / 100;
			DecimalFormat formatter = new DecimalFormat("0.00");
			String sumFormatted = formatter.format(sum);
			System.out.println(sumFormatted + "$");
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