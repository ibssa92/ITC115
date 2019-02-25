import java.util.Arrays;

public class Assignment8 {

	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 4, 5, 6 };
		int[] list2 = { 2, 1, 4, 3, 6, 5 };
		
		if (isSorted(list1)) {
			System.out.println("list1 is ascending");
		}
		else {
			System.out.println("list1 isn't ascending");
		}
		
		if (isSorted(list2)) {
			System.out.println("list2 is ascending");
		}
		else {
			System.out.println("list2 isn't ascending");
		}

	}
	
	public static boolean isSorted(int [] list) {
		/*
		int num1 = list[0];
		
		for (int i = 0; i < list.length; i++) {
			int num2 = list[i];
			
			if (num1 >= num2) {
				return false;
			}
			num1 = num2;
			
		}
		
	
		return true;
		*/
		
		String s = Arrays.toString(list);
		Arrays.sort(list);
		String z = Arrays.toString(list);
		if (s == z) {
			return true;
		} else {
			return false;
		}      
		

	}      

}
