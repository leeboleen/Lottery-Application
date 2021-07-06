/** Lottery Application:
 * 
 * This program is a simple lottery application that
 * randomly generates 6 numbers, representing lottery ball selections,
 * that are; unique, sorted in numerical order, range between values of
 * 1-49 and displayed via a GUI. The numbers are grouped 1 through 9, 
 * and sorted by colour, to separate the generated selections.
 * 
 * Date: [06-07-2021] 
 * @author: [Lee Barnes]
 */

// import(s) -- Arrays import for Java array functions
import java.util.Arrays;

public class Lottery {

	public static void main(String[] args) {
		
		int[] lottery = new int[6]; // creates integer array for 6 lottery numbers (can be altered to 7 via array index)
	    int randomNum; // defines randomNum variable
	    
	    for (int i = 0; i < 6; i++) { // for loop to loop 6 times
	        randomNum = (int) (Math.random() * 49); // each loop -- random number between 1-49 generated
	        
	        for (int x = 0; x < i; x++) {
	            if (lottery[x] == randomNum) // checks if number above has been generated before
	            {
	                randomNum = (int) (Math.random() * 49);// If number IS same, generate new random number
	                x = -1; // restarts the loop
	            }
	        }
	        lottery[i] = randomNum; // assigns randomNum var to lottery index 'i'
	    }
	    
	    Arrays.sort(lottery); // sorts array, numerically ascending, via .sort function

	    for (int i = 0; i < lottery.length; i++) // for loop - loops length of lottery array
	        System.out.print(lottery[i] + " "); // prints lottery numbers to console
	
	}

}
