
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberTheoryForNewbies {

    static void solve() throws Exception {
	Scanner input = new Scanner(System.in);
	while (input.hasNextLong()) {
	    String inputValue = input.nextLine();
	    StringBuilder minimal = new StringBuilder();
	    StringBuilder maximal = new StringBuilder();
	    char[] characters = inputValue.toCharArray();
	    int length = characters.length;
	    Arrays.sort(characters);
	    int index;
	    for (index = 0; index < length; index++) {
		if (characters[index] != '0') {
		    break;
		}
	    }
	    if (index != 0) {
		characters[0] = characters[index];
		characters[index] = '0';
	    }
	    for (int i = 0; i < length; i++) {
		minimal.append(characters[i]);
	    }
	    Arrays.sort(characters);
	    for (int i = length - 1; i > -1; i--) {
		maximal.append(characters[i]);
	    }
	    long maximalNumber = Long.valueOf(maximal.toString());
	    long minimalNumber = Long.valueOf(minimal.toString());
	    long difference = maximalNumber - minimalNumber;
	    System.out.println(maximal + " - " + minimal + " = " + difference + " = 9 * " + (difference / 9));
	}
	input.close();
    }

    static int nextInt() throws IOException {
	return parseInt(next());
    }

    static long nextLong() throws IOException {
	return parseLong(next());
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
