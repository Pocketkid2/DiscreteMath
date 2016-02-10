import java.util.Arrays;

public class Main {

	public static void main(final String[] args) {
		// Test the combinatorics file
		System.out.println("10! = " + Combinatorics.factorial(10));
		System.out.println("Sequence n=10, k=5 -> " + Combinatorics.sequence(10, 5));
		System.out.println("Arrangement n=10, k=5 -> " + Combinatorics.arrangement(10, 5));
		System.out.println("10 choose 5 -> " + Combinatorics.subset(10, 5));
		System.out.println("31 multichoose 3 -> " + Combinatorics.multisubset(31, 3));

		// Test the pascal's triangle
		for (int n = 0; n < 10; n++) {
			System.out.println(Arrays.toString(PascalTriangle.row(n)));
		}

		// Test the fibonacci formulas
		int error = 0;
		for (int i = 1; i < 40; i++) {
			long r = Fibonacci.recursive(i);
			long c = Fibonacci.closed(i);

			System.out.println("Recursive F(" + i + ") = " + r);
			System.out.println("Closed-form F(" + i + ") = " + c);

			if (c == r) {
				System.out.println("They are the same");
			} else {
				System.out.println("They are not the same");
				error++;
			}
		}
		System.out.println("There were " + error + " errors in the fibonacci sequence calculator");
	}

}
