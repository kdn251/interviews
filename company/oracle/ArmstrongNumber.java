/**
 *
 * @author rjtmahinay
 *
 */

public class ArmstrongNumber {

	/**
	 *
	 * @param num number to be checked
	 * @return result if it is an Armstrong number
	 */
	boolean isArmstrongNumber(int num) {
		int numTemp = num;
		int sum = 0;
		int cubeNum = 0;
		while (numTemp > 0) {
			cubeNum = numTemp % 10;
			sum += Math.pow(cubeNum, 3);
			numTemp = numTemp / 10;
		}
		return (sum == num);
	}

}
