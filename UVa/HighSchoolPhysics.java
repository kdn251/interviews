
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HighSchoolPhysics {

	static void solve() throws Exception {
		String line = nextLine();
		while (!"".equals(line)) {
			String[] numbers = line.split(" ");
			int v = Integer.valueOf(numbers[0]);
			int t = Integer.valueOf(numbers[1]) * 2;
			System.out.println(v * t);
			line = nextLine();
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
