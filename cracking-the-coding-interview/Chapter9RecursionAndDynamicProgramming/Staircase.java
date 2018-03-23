/* a child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps
 * at a time. Implement a method to count how many possible ways the child can run up the stairs */

 public class Staircase {
 	public static int countWaysDP(int n, int[] map) {
 		if(n < 0) {
 			return 0;
 		}
 		else if(n == 0) {
 			return 1;
 		}
 		else if(map[n] > -1) {
 			return map[n];
 		}
 		else {
 			map[n] = countWaysDP(n - 1, map) +
 					 countWaysDP(n - 2, map) +
 					 countWaysDP(n - 3, map);
 			return map[n];
 		}
 	}
 }