import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Test the combinatorics file
		System.out.println("10! = " + Combinatorics.factorial(10));
		System.out.println("Sequence n=10, k=5 -> " + Combinatorics.sequence(10, 5));
		System.out.println("Arrangement n=10, k=5 -> " + Combinatorics.arrangement(10, 5));
		System.out.println("10 choose 5 -> " + Combinatorics.subset(10, 5));
		System.out.println("");
		
		// Test the pascal's triangle
		for (int n = 0; n < 10; n++) {
			System.out.println(Arrays.toString(PascalTriangle.row(n)));
		}
	}

}
