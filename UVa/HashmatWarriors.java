import java.util.Scanner;

public class HashmatWarriors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nextLine = input.nextLine();
		while (!"".equals(nextLine)) {
			String[] nums = nextLine.split(" ");
			long firstNum = Long.valueOf(nums[0]);
			long secondNum = Long.valueOf(nums[1]);
			System.out.println(Math.abs(secondNum - firstNum));
			nextLine = input.nextLine();
		}
	}
}
