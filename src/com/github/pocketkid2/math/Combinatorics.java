package com.github.pocketkid2.math;

/**
 * @author Adam
 *
 *         This class contains methods calculating simple combinatorics formula.
 *         Currently there are 5 methods and they are as follows: Factorial, the
 *         base of all the other calculations. The other four methods calculate
 *         the answer to the following counting question in different ways: "How
 *         many ways are there to select K objects from N distinct objects?"
 */
public class Combinatorics {

	/**
	 * This method calculates the value of N times all the numbers less than it
	 * down to one. This is called N factorial, or N!. It is defined
	 * recursively. Valid entries are positive integers. Any values less than
	 * zero will be returned.
	 *
	 * @param n
	 *            The value of N to calculate for, a positive integer.
	 * @return The value of N factorial, or the parameter if it is less than 2
	 */
	public static long factorial(final long n) {
		// If we are at 0 or 1 we just return 1 to start the backtrace
		if (n < 2) {
			return 1;
		} else {
			// Otherwise we keep going deeper
			return n * factorial(n - 1);
		}
	}

	/**
	 * The first of the four basic combinatorics counting questions. This
	 * calculates the answer to the question where ORDER MATTERS and REPETITION
	 * IS ALLOWED. This is known as a sequence, and is very simply, N to the
	 * power of K.
	 *
	 * @param n
	 *            The value of N. Must be a positive integer
	 * @param k
	 *            The value of K. Must be a positive integer.
	 * @return N to the power of K, which is the answer to the question.
	 */
	public static long sequence(final int n, int k) {
		// Check for invalid values of N and K
		if ((k < 1) || (n < 1)) {
			return 0;
		}
		// This is simply N to the power of K
		long result = 1;
		while (k > 0) {
			result *= n;
			k--;
		}
		// And return the result
		return result;
	}

	/**
	 * The second of the four basic combinatorics counting questions. It
	 * calculates the answer where ORDER MATTERS and REPETITION IS NOT ALLOWED.
	 * This is known as an arrangement, and can be defined and calculated with
	 * factorials.
	 *
	 * @param n
	 *            The value of N. Must be a positive integer.
	 * @param k
	 *            The value of K. This must be less than or equal to N, and must
	 *            be greater than zero.
	 * @return The answer to the question.
	 */
	public static long arrangement(final int n, final int k) {
		// Check for invalid values of N and K
		if ((k > n) || (k < 0) || (n < 1)) {
			return 0;
		}
		// The value is calculated with factorials
		final long result = factorial(n) / factorial(n - k);
		// And return the result
		return result;
	}

	/**
	 * The third of the four basic combinatorics counting questions. It
	 * calculates the answer where ORDER DOES NOT MATTER and REPETITION IS NOT
	 * ALLOWED. This is called a subset, and is defined with factorials, as an
	 * extension of the second question above. The answer is also known as
	 * "N choose K".
	 *
	 * @param n
	 *            The value of N. Must be a positive integer.
	 * @param k
	 *            The value of K. This must be less than or equal to N, and must
	 *            be greater than zero.
	 * @return The answer to the question
	 */
	public static long subset(final int n, final int k) {
		// Check for invalid values of N and K
		if ((k > n) || (k < 0) || (n < 1)) {
			return 0;
		}
		// This function is just an extension of the arrangement() function
		final long result = arrangement(n, k) / factorial(k);
		// And return the result
		return result;
	}

	// Choose K objects from N objects where ORDER DOESN'T MATTER and REPETITION
	// IS ALLOWED
	// Also known as N multichoose K
	/**
	 * The last of the four basic combinatorics counting questions. It
	 * calculates the answer where ORDER DOES NOT MATTER but REPETITION IS
	 * ALLOWED. It is an extension of the question above, and is also known as
	 * "N multichoose K".
	 *
	 * @param n
	 *            The value of N. Must be a positive integer.
	 * @param k
	 *            The value of K. Must be zero or greater.
	 * @return The answer to the question.
	 */
	public static long multisubset(final int n, final int k) {
		// Check for invalid values of N and K
		if ((k < 0) || (n < 1)) {
			return 0;
		}
		// Multichoose is defined with a choose
		final long result = subset((n + k) - 1, k);
		// And return the result
		return result;
	}
}
