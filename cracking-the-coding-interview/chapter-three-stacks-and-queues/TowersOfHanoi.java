package algorithms.recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static final int ONE_DISK = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many disks do you have?: ");
		int numberOfDisks = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter three characters for the towers: ");
		char firstTower = scanner.nextLine().trim().charAt(0);
		char secondTower = scanner.nextLine().trim().charAt(0);
		char thirdTower = scanner.nextLine().trim().charAt(0);
		scanner.close();
		System.out.println("Do this to solve the Tower of Hanoi: ");
		showSteps(numberOfDisks, firstTower, secondTower, thirdTower);
	}

	private static void showSteps(int numberOfDisks, char source, char via, char destination) {
		if (numberOfDisks == ONE_DISK) {
			printMoveForOneDisk(source, destination);
			return;
		}
		showSteps(numberOfDisks - 1, source, destination, via);
		printMoveForOneDisk(source, destination);
		showSteps(numberOfDisks - 1, via, source, destination);//tail recursion complexity is O(2^n)
	}

	private static void printMoveForOneDisk(char source, char destination) {
		System.out.println("Move the top disk from the tower '" + source + "' to tower '" + destination + "'.");
	}
}
