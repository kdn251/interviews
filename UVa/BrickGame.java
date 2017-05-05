package mathematics.adHoc.simpler;

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

public class BrickGame {

    static void solve() throws Exception {
	int numberOfTestCases = nextInt();
	int caseNum = 1;
	while (numberOfTestCases != 0) {
	    String[] numbersString = nextLine().split(" ");
	    int numberOfMembers = parseInt(numbersString[0]);
	    List<Integer> numbers = new ArrayList<Integer>();
	    for (int i = 0; i < numberOfMembers + 1; i++) {
		numbers.add(parseInt(numbersString[i]));
	    }
	    Collections.sort(numbers);
	    System.out.print(
		    "Case " + caseNum + ": " + numbers.subList(1, numbers.size()).get(numberOfMembers / 2) + "\n");
	    numberOfTestCases--;
	    caseNum++;
	}
    }

    static int nextInt() throws IOException {
	return parseInt(next());
    }

    static String nextLine() throws IOException {
	return in.readLine();
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
