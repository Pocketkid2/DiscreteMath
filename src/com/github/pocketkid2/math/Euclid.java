package com.github.pocketkid2.math;

/**
 * @author Adam
 *
 *         This class contains (currently) an algorithm of Euclid's for
 *         calculating the GCD (Greatest Common Divisor)
 */
public class Euclid {

	/**
	 * Calculates the GCD of the given parameters using a division method.
	 *
	 * @param a
	 *            The first number
	 * @param b
	 *            The second number
	 * @return The greatest common divisor of the two numbers
	 */
	public static int gcd_divide(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	/**
	 * Calculates the GCD of the given parameters using a subtraction method.
	 *
	 * @param a
	 *            The first number (Must be positive)
	 * @param b
	 *            The second number (Must be positive)
	 * @return The greatest common divisor of the two numbers
	 */
	public static int gcd_subtract(int a, int b) {
		if ((a > 0) && (b > 0)) {
			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
			return a;
		}
		return 0;
	}

	/**
	 * Calculates the GCD of the given parameters using a recursive method.
	 *
	 * @param a
	 *            The first number (Must be positive)
	 * @param b
	 *            The second number (Must be positive)
	 * @return The greatest common divisor of the two numbers
	 */
	public static int gcd_recurse(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd_recurse(b, a % b);
		}
	}
}
