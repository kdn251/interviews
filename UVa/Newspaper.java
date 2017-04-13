/**
* News agency pays money for articles according to some rules. Each character has its own value (some
* characters may have value equals to zero). Author gets his payment as a sum of all character’s values
* in the article. You have to determine the amount of money that news agency must pay to an author.
* Input
* The first line contains integer N (0 < N ≤ 5), it is a number of tests. Each test describes an integer
* K (0 < K ≤ 100), the number of paid characters. On next K lines there are table of paid characters
* and its values (character values are written in cents). If character can not be found in the table, then
* its value is equal to zero. Next, there is integer M (0 < M ≤ 150000). Next M lines contain an article
* itself. Each line can be up to 10000 characters length. Be aware of a large input size, the whole input
* file is about 7MB.
* Output
* For each test print how much money publisher must pay for an article in format ‘x.yy$’. Where x is
* a number of dollars without leading zeros, and yy number of cents with one leading zero if necessary.
* Examples: ‘3.32$’, ‘13.07$’, ‘71.30$’, ‘0.09$’.
* Sample Input
* 1
* 7
* a 3
* W 10
* A 100
* , 10
* k 7
* . 3
* I 13
* 7
* ACM International Collegiate Programming Contest (abbreviated
* as ACM-ICPC or just ICPC) is an annual multi-tiered competition
* among the universities of the world. The ICPC challenges students
* to set ever higher standards of excellence for themselves
* through competition that rewards team work, problem analysis,
* and rapid software development.
* From Wikipedia.
* Sample Output
* 3.74$
*/

//https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2315

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Newspaper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfTestCases = input.nextInt();
		while (numberOfTestCases != 0) {
			Map<String, Integer> values = new HashMap<String, Integer>();
			int numberOfValuableCharacters = input.nextInt();
			while (numberOfValuableCharacters != 0) {
				values.put(input.next(), input.nextInt());
				numberOfValuableCharacters--;
			}
			int numberOfLines = input.nextInt();
			input.nextLine();
			double sum = 0;
			while (numberOfLines != 0) {
				String textAsString = input.nextLine();
				for (int i = 0; i < textAsString.length(); i++) {
					String c = textAsString.charAt(i) + "";
					if (values.containsKey(c)) {
						sum = sum + values.get(c);
					}
				}
				numberOfLines--;
			}
			sum = sum / 100;
			DecimalFormat formatter = new DecimalFormat("0.00");
			String sumFormatted = formatter.format(sum);
			System.out.println(sumFormatted + "$");
			numberOfTestCases--;
		}
	}

}