/* write methods to implement the multiply, subtract, and divide operations for integers. Use only the add operator */

public class Operations {
	/* flip a positive sign to negative or negative sign to positive */
	public static int negate(int a) {
		int neg = 0;
		int d = a < 0 ? 1 : -1;
		while(a != 0) {
			neg += d;
			a += d;
		}
		return neg;
	}

	/* subtract two numbers by negating b and adding them */
	public static int minus(int a, int b) {
		return a + negate(b);
	}

	/* multiply a by b by adding a to itself b times */
	public static int multiply(int a, int b) {
		if(a < b) {
			return multiply(b, a); //algorithm is faster is b < a
		}
		int sum = 0;
		for(int i = abs(b); i > 0; i--) {
			sum += a;
		}
		if(b < 0) {
			sum = negate(sum);
		}
		return sum;
	}

	/* return absolute value */
	public static int abs(int a) {
		if(a < 0) {
			return negate(a);
		}
		else {
			return a;
		}
	}

	public int divide(int a, int b) throws ArithmeticException {
		if(b == 0) {
			throw new java.lang.ArithmeticException("ERROR");
		}
		int absa = abs(a);
		int absb = abs(b);

		int product = 0;
		int x = 0;
		while(product + absb <= absa) { //don't go past a
			product += absb;
			x++;
		}

		if((a < 0 && b < 0) || (a > 0 && b > 0)) {
			return x;
		}
		else {
			return negate(x);
		}
	}
}