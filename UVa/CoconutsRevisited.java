/**
 * The short story titled Coconuts, by Ben Ames Williams, appeared in the Saturday Evening Post on
 * October 9, 1926. The story tells about five men and a monkey who were shipwrecked on an island.
 * They spent the first night gathering coconuts. During the night, one man woke up and decided to take
 * his share of the coconuts. He divided them into five piles. One coconut was left over so he gave it to
 * the monkey, then hid his share and went back to sleep.
 * Soon a second man woke up and did the same thing. After dividing the coconuts into five piles,
 * one coconut was left over which he gave to the monkey. He then hid his share and went back to bed.
 * The third, fourth, and fifth man followed exactly the same procedure. The next morning, after they
 * all woke up, they divided the remaining coconuts into five equal shares. This time no coconuts were
 * left over.
 * An obvious question is “how many coconuts did they originally gather?” There are an infinite
 * number of answers, but the lowest of these is 3,121. But that’s not our problem here.
 * Suppose we turn the problem around. If we know the number of coconuts that were gathered, what
 * is the maximum number of persons (and one monkey) that could have been shipwrecked if the same
 * procedure could occur?
 * Input
 * The input will consist of a sequence of integers, each representing the number of coconuts gathered by
 * a group of persons (and a monkey) that were shipwrecked. The sequence will be followed by a negative
 * number.
 * Output
 * For each number of coconuts, determine the largest number of persons who could have participated in
 * the procedure described above. Display the results similar to the manner shown below, in the Sample
 * Output. There may be no solution for some of the input cases; if so, state that observation.
 * Sample Input
 * 25
 * 30
 * 3121
 * -1
 * Sample Output
 * 25 coconuts, 3 people and 1 monkey
 * 30 coconuts, no solution
 * 3121 coconuts, 5 people and 1 monkey
 */

//https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=557

import java.util.Scanner;

public class CoconutsRevisited {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, rez, j;
		boolean isValid;
		while (true) {
			isValid = false;
			int num = input.nextInt();
			if (num == -1) {
				break;
			}
			for (i = (int) (Math.sqrt(num) + 1); i > 1; i--) {
				rez = num;
				for (j = 0; j < i && rez % i == 1; j++) {
					rez = rez - rez / i - 1;
				}
				if (rez % i == 0 && i == j) {
					isValid = true;
					break;
				}
			}
			if (isValid) {
				System.out.println(num + " coconuts, " + i
						+ " people and 1 monkey");
			} else {
				System.out.println(num + " coconuts, no solution");
			}
		}

	}
}
