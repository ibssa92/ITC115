import java.util.Arrays;

public class Assignment8 {

	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 4, 5, 6 };
		int[] list2 = { 2, 1, 4, 3, 6, 5 };

		// System.out.println(Arrays.toString(list1));
		// System.out.println(Arrays.toString(list2));
		// Arrays.sort(list2);
		// System.out.println(Arrays.toString(list2));

		if (isSorted(list1)) {
			System.out.println("list1 is ascending");
		} else {
			System.out.println("list1 IS NOT ascending");
		}

		System.out.println("");

		if (isSorted(list2)) {
			System.out.println("list2 is ascending");
		} else {
			System.out.println("list2 IS NOT ascending");
		}

	}

	public static boolean isSorted(int[] list) {

		String s = Arrays.toString(list);
		System.out.println(s);

		Arrays.sort(list);
		String z = Arrays.toString(list);
		System.out.println(z);

		if (s != z) {
			return false;
		} else {

			return true;
		}
	}

}