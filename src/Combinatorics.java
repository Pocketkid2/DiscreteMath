// This class contains common combinatorics formulas
public class Combinatorics {

	// Returns n! (factorial)
	public static long factorial(final long n) {
		// If we are at 0 or 1 we just return 1 to start the backtrace
		if (n < 2) {
			return 1;
		} else {
			// Otherwise we keep going deeper
			return n * factorial(n - 1);
		}
	}

	// Choose K objects from N objects where ORDER MATTERS and REPETITION
	// ALLOWED
	public static long sequence(final int n, int k) {
		// Check for invalid values of N and K
		if ((k > n) || (k < 0) || (n < 1)) {
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

	// Choose K objects from N objects where ORDER METTERS and REPETITION NOT
	// ALLOWED
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

	// Choose K objects from N objects where ORDER DOESN'T MATTER and REPETITION
	// NOT ALLOWED
	// Also known as N choose K
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
