// Fibonacci numbers and sequence formulas
public class Fibonacci {

	// 1 + sqrt(5) / 2
	public static final double phi;

	static {
		// Calculate the value of Phi
		phi = (1.0 + Math.sqrt(5.0)) / 2.0;
	}

	// The recursive definition of the Nth fibonacci number
	public static long recursive(int n) {
		// If F(0) = 0 and F(1) = 1
		if (n < 2) {
			return n;
		}
		// Return F(n - 1) + F(n - 2)
		return recursive(n - 1) + recursive(n - 2);
	}

	// The closed-form definition of the Nth fibonacci number
	public static long closed(int n) {
		// Calculate
		return Math.round((Math.pow(phi, n) - Math.pow(-phi, -n)) / Math.sqrt(5));
	}
}
