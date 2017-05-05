/**
 * Let us look at a boring mathematics problem. :-)
 * We have three different integers, x, y and z, which satisfy the following three relations:
 * • x + y + z = A
 * • xyz = B
 * • x
 * 2 + y
 * 2 + z
 * 2 = C
 * You are asked to write a program that solves for x, y and z for given values of A, B and C.
 * Input
 * The first line of the input file gives the number of test cases N (N < 20). Each of the following N lines
 * gives the values of A, B and C (1 ≤ A, B, C ≤ 10000).
 * Output
 * For each test case, output the corresponding values of x, y and z. If there are many possible answers,
 * choose the one with the least value of x. If there is a tie, output the one with the least value of y.
 * If there is no solution, output the line ‘No solution.’ instead.
 * Sample Input
 * 2
 * 1 2 3
 * 6 6 14
 * Sample Output
 * No solution.
 * 1 2 3
 */
//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2612

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SolveEquation {

    static void solve() throws Exception {

	int numberOfTestCases = nextInt();
	while (numberOfTestCases != 0) {

	    int A = nextInt();
	    int B = nextInt();
	    int C = nextInt();
	    boolean hasSolution = false;

	    for (int x = -22; x <= 22 && !hasSolution; x++) {
		if (x * x <= C) {
		    for (int y = -100; y <= 100 && !hasSolution; y++) {
			if (x!= y && y * y <= C && (x * x + y * y <= C)) {
			    int z = A - x - y;
			    if ((z != y && z != x && x * x + y * y + z * z == C) && x * y * z == B) {
				hasSolution = true;
				System.out.println(x + " " + y + " " + z);
			    }
			}
		    }
		}
	    }
	    if (!hasSolution) {
		System.out.println("No solution.");
	    }

	    numberOfTestCases--;
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
