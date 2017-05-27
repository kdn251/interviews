/**
 * You have bought a car in order to drive from Waterloo to a big city. The odometer on their car is
 * broken, so you cannot measure distance. But the speedometer and cruise control both work, so the car
 * can maintain a constant speed which can be adjusted from time to time in response to speed limits,
 * traffic jams, and border queues. You have a stopwatch and note the elapsed time every time the speed
 * changes. From time to time you wonder, “how far have I come?”. To solve this problem you must write
 * a program to run on your laptop computer in the passenger seat.
 * Input
 * Standard input contains several lines of input: Each speed change is indicated by a line specifying the
 * elapsed time since the beginning of the trip (hh:mm:ss), followed by the new speed in km/h. Each
 * query is indicated by a line containing the elapsed time. At the outset of the trip the car is stationary.
 * Elapsed times are given in non-decreasing order and there is at most one speed change at any given
 * time.
 * Output
 * For each query in standard input, you should print a line giving the time and the distance travelled, in
 * the format below.
 * Sample Input
 * 00:00:01 100
 * 00:15:01
 * 00:30:01
 * 01:00:01 50
 * 03:00:01
 * 03:00:05 140
 * Sample Output
 * 00:15:01 25.00 km
 * 00:30:01 50.00 km
 * 03:00:01 200.00 km
 */
//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1222

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageSpeed {

	public static void main(String[] args) {
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
