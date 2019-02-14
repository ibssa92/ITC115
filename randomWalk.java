import java.util.Random;

public class randomWalk {

	public static void main(String[] args) {
		randomWalk();

	}

	public static void randomWalk() {
		
		
		// initialize the position and the max position
		int position = 0;
		int max = 0;
		
		

		while (position != 3 && position != -3) {//keep the while loop going until it hits 3 or -3
			Random rand = new Random();
			int randomstep = rand.nextInt(2);

			if (randomstep == 0) { // if random number is 0 increment +1. Else it would be 1 which decreases -1
				position++;
				if (position > max) { // if the current position is greater than the current max, the max updates to that
					max = position;
				}
			} else {

				position--;
				
			}
			//print current position
			System.out.println("Position = " + position);

		}
		
		
		
		System.out.println("Max Position = " + max);
	}
}
