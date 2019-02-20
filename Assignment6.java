import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Assignment6 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File ("boysgirls.txt");
		Scanner input = new Scanner(f);
		
		boyGirl(input);

	}
	
	public static void boyGirl(Scanner console) {
		
		int boy = 0;
	    int boySum = 0;
	    int girl = 0;
	    int girlSum = 0;
	    int i = 2;
	    
	    while (console.hasNext()) {
	        console.next();
	        if ((i / 2) % 2 != 0) {
	            boySum += console.nextInt();
	            boy++;
	        } else {
	            girlSum += console.nextInt();
	            girl++;
	        }
	        i += 2;
	    }
	    
	    System.out.println(boy + " boys, " + girl + " girls");
	    System.out.println("Difference between boys' and girls' sums: " + Math.abs(boySum - girlSum));
		
	}

}
