
public class Assignment3 {

	public static void main(String[] args) {

		printPowersofN(5, 3);
		printPowersofN(2, 7);

	}

	public static void printPowersofN(int base, int exponent) {

		System.out.print("1 ");

		for (int i = 1; i <= exponent; i++) {
			double num1 = Math.pow(base, i);
			System.out.print((int)(num1) + " ");

		}

		System.out.println(" ");
	}

}
