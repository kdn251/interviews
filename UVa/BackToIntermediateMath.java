//https://uva.onlinejudge.org/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=&problem=1714

import java.text.DecimalFormat;
import java.util.Scanner;

public class BackToIntermediateMath {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		DecimalFormat formatter = new DecimalFormat("#0.000");
		for (int i = 0; i < numberOfTestCases; i++) {
			double distance = input.nextDouble();
			double riverSpeed = input.nextDouble();
			double boatSpeed = input.nextDouble();
			if (riverSpeed == 0 || boatSpeed == 0 || boatSpeed <= riverSpeed) {
				System.out.println("Case " + (i + 1) + ": can't determine");
			} else {
				double P1 = distance / boatSpeed;
				double P2 = distance
						/ Math.sqrt(boatSpeed * boatSpeed - riverSpeed
								* riverSpeed);
				System.out.print("Case " + (i + 1) + ": "
						+ formatter.format(Math.abs(P1 - P2)) + "\n");
			}
		}
	}
}
