
import static java.lang.Long.parseLong;
import static java.lang.System.exit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HashmatWarriors {

	static void solve() throws Exception {

		String nextLine = nextLine();
		while (!"".equals(nextLine)) {
			String[] nums = nextLine.split(" ");
			long firstNum = Long.valueOf(nums[0]);
			long secondNum = Long.valueOf(nums[1]);
			System.out.println(Math.abs(secondNum - firstNum));
			nextLine = nextLine();
		}
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

	static String nextLine() throws IOException {
		return in.readLine();
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
