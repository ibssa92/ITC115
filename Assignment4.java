public class Assignment4 {

	public static void main(String[] args) {
		System.out.print(repl ("johnny", 2));

	}
	
	//method that accepts string and number as parameters
	public static String repl (String input, int a) {
		String concat = "";
		
		
		for (int i = 0; i < a; i++) {
			concat += input;
		}
		
		return concat;
	}

}
