package com.github.pocketkid2.math;

/**
 * @author Adam
 *
 *         This class does calculations based on the Fibonacci sequence.
 */
public class Fibonacci {

	/**
	 * This constant represents the variable PHI used in the closed form
	 * calculation of a Fibonacci number.
	 *
	 * Its exact value is (1 + sqrt(5)) / 2
	 */
	public static final double phi;

	/*
	 * This block of code initializes the constant defined above.
	 */
	static {
		// Calculate the value of Phi
		phi = (1.0 + Math.sqrt(5.0)) / 2.0;
	}

	/**
	 * This method calculates the Nth Fibonacci number by the recursive
	 * definition. It therefore performs slower on much larger values, but it
	 * works purely with integer values so it is always correct.
	 *
	 * @param n
	 *            An integer representing N. If this is greater than zero the
	 *            method will return the Nth Fibonacci number. If this is less
	 *            than zero, the parameter will simply be returned.
	 * @return The value of the Nth Fibonacci number in the Fibonacci sequence.
	 *         If the parameter for N was less than zero it will be returned.
	 */
	public static long recursive(int n) {
		// If F(0) = 0 and F(1) = 1
		if (n < 2) {
			return n;
		}
		// Return F(n - 1) + F(n - 2)
		return recursive(n - 1) + recursive(n - 2);
	}

	/**
	 * This method calculates the Nth Fibonacci number by the closed form
	 * method. It contains irrational numbers in the computation and therefore
	 * is not exact. However, using double-precision floating point values in
	 * the calculation gives remarkable accuracy in the results, and is safe to
	 * round up for smaller numbers. This is shown in the test inside Main.java
	 *
	 * @param n
	 *            An integer representing N. If this is greater than zero the
	 *            method will return the Nth Fibonacci number. If this is less
	 *            than zero, the parameter will simply be returned.
	 * @return The value of the Nth fibonacci number in the Fibonacci sequence.
	 *         It is calculated as a double-precision floating point value and
	 *         then rounded to a long.
	 */
	public static long closed(int n) {
		// Return values we don't want to calculate for
		if (n < 2) {
			return n;
		}
		// Calculate
		return Math.round((Math.pow(phi, n) - Math.pow(-phi, -n)) / Math.sqrt(5));
	}
}
