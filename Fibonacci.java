
public class Fibonacci {

	public static void main(String[] args) {
		
		//declare variable
		int fibo1 = 0;
		int fibo2 = 1;
		int fibonacci;
		
		 System.out.println("First 12 Fibonacci Numbers: ");
		 System.out.print(0 + ", ");
		 System.out.print(1 + ", ");
		 
		 for (int i = 2; i <= 11; i++) {//print 12 times
			 fibonacci = fibo1 + fibo2;
			 System.out.print(fibonacci + ", ");
			 fibo1 = fibo2;
			 fibo2 = fibonacci;
		 }

	}

}
