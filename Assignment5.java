import java.util.*;
public class Assignment5 {

	public static void main(String[] args) {
		
		printGPA();

	}
	
	public static void printGPA() {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a student record: ");
		String name = console.next();
		int numScores = console.nextInt();
		double sum = 0.0;
		
		for (int i = 0; i < numScores; i++) {
			int score = console.nextInt();
			sum += score;
		}
		
		double avgScore = sum / numScores;
		System.out.println(name + "'s grade is " + avgScore);
		
	}

}
