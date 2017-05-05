/**
 * There is man named ”mabu” for switching on-off light in our University. He switches on-off the lights
 *  in a corridor. Every bulb has its own toggle switch. That is, if it is pressed then the bulb turns on.
 * Another press will turn it off. To save power consumption (or may be he is mad or something else)
 * he does a peculiar thing. If in a corridor there is n bulbs, he walks along the corridor back and forth
 * n times and in i-th walk he toggles only the switches whose serial is divisable by i. He does not press
 * any switch when coming back to his initial position. A i-th walk is defined as going down the corridor
 * (while doing the peculiar thing) and coming back again. Now you have to determine what is the final
 * condition of the last bulb. Is it on or off?
 * Input
 * The input will be an integer indicating the n’th bulb in a corridor. Which is less then or equals 232 −1.
 * A zero indicates the end of input. You should not process this input.
 * Output
 * Output ‘yes’ if the light is on otherwise ‘no’, in a single line.
 * Sample Input
 * 3
 * 6241
 * 8191
 * 0
 * Sample Output
 * no
 * yes
 * no
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=&problem=1051

import java.util.Scanner;

public class LightMoreLight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		while (number != 0) {
			if (isAPerfectSquare(number)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			number = input.nextLong();
		}
	}

	private static boolean isAPerfectSquare(long number) {
		long squareRoot = (long) Math.sqrt(number);
		return squareRoot * squareRoot == number;
	}

}
