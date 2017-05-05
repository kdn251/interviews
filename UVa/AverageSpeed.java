
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class AverageSpeed {

    static void solve() throws Exception {
	int speed = 0;
	boolean reachedTheEnd = false;
	String nextLine = nextLine();
	double hour = 0;
	double baseHour = 0;
	double kilometersPassed = 0;
	while (!reachedTheEnd) {
	    String[] time1 = nextLine.split(" ");
	    String[] time = nextLine.split(":");
	    String[] extendedTime = new String[2];
	    DecimalFormat formatter = new DecimalFormat("#0.00");
	    hour = calcHours(time1[0]);
	    kilometersPassed += (hour - baseHour) * speed;
	    if (time[2].contains(" ")) {
		extendedTime = time[2].split(" ");
		speed = Integer.valueOf(extendedTime[1]);
	    } else {
		System.out.print(nextLine + " " + formatter.format(kilometersPassed) + " km\n");
	    }
	    baseHour = hour;
	    nextLine = nextLine();
	}

    }

    public static double calcHours(String s) {
	String[] arr = s.split(":");
	return (Integer.parseInt(arr[0]) * 3600 + Integer.parseInt(arr[1]) * 60 + Integer.parseInt(arr[2])) * 1.0
		/ 3600;
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
