package com.github.pocketkid2.math;

/**
 * @author Adam
 *
 *         This class contains nothing currently but a method to calculate the
 *         values of the Nth row of Pascal's Triangle.
 */
public class PascalTriangle {

	/**
	 * Get the values of the Nth row of Pascal's Triangle. It uses the N choose
	 * K definition (fomula found in the Combinatorics class)
	 *
	 * @param n
	 *            The value of N
	 * @return An integer array representing the row. The first item (index 0)
	 *         is always 1.
	 */
	public static long[] row(int n) {
		// First check for the top row
		if (n < 1) {
			return new long[] { 1 };
		}
		// Create the array for row N
		long[] values = new long[n + 1];
		// Loop through all the indexes
		for (int i = 0; i <= n; i++) {
			// And use N choose K to find the values
			values[i] = Combinatorics.subset(n, i);
		}
		// And return it
		return values;
	}
}
