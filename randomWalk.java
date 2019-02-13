import java.util.Random;

public class randomWalk {

	public static void main(String[] args) {
		// initialize the position and the max position
		int position = 0;
		int max = 0;
		while (position <= 3 && position >= -3) {
			for (int i = 1; i <= 100; i++) {// position starts as 0. increases or decreases based off randomWalk (+1 or
											// -1)
				position += randomWalk();

				System.out.println("position = " + position); // print each position in the loop
			}
		}
		// if the highest position is a negative integer, print max position as 0.
		// Otherwise, the max is the highest position
		if (position < 0) {
			max = 0;
		}
		max = position;

		System.out.println("max = " + max); // print the max position
	}
	
	
	

	public static int randomWalk() {

		// create instance of Random Class
		Random rand = new Random();

		// generate random integers 0 or 1; 1 would be +1 step forward and 0 would be -1
		// step backwards
		int randomstep = rand.nextInt(2);

		if (randomstep == 0) {
			return -1;
		}

		return 1;

	}

}
