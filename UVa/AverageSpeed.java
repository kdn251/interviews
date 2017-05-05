
//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1222

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageSpeed {

	static void solve() throws Exception {
		int speed = 0;
		boolean reachedTheEnd = false;
		Scanner input = new Scanner(System.in);
		String nextLine = input.nextLine();
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
				System.out.print(nextLine + " "
						+ formatter.format(kilometersPassed) + " km\n");
			}
			baseHour = hour;
			nextLine = input.nextLine();
		}

	}

	private static double calcHours(String s) {
		String[] arr = s.split(":");
		return (Integer.parseInt(arr[0]) * 3600 + Integer.parseInt(arr[1]) * 60 + Integer
				.parseInt(arr[2])) * 1.0 / 3600;
	}
}
