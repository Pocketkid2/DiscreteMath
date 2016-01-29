// This class contains functions related to Pascal's Triangle
public class PascalTriangle {

	// Get an array of integers representing the Nth row of Pascal's Triangle
	// Uses the definition of Pascal's Triangle with N choose K
	public static long[] row(int n) {
		// First check for the top row
		if (n < 1) {
			return new long[]{1};
		}
		// Create the array for row N
		long[] values = new long[n+1];
		// Loop through all the indexes
		for (int i = 0; i <= n; i++) {
			// And use N choose K to find the values
			values[i] = Combinatorics.subset(n, i);
		}
		// And return it
		return values;
	}
}
