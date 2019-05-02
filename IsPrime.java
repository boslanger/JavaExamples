/*
 * 20190502
 * Coding challenge - Is the number prime?
 *  TODO: 
 *  - add a input error statement block.
 *  - verify that the loop stops when i > userRequest.
 */

import java.util.Scanner;

public class IsPrime {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean prime = true; // changed when loop finds a divisor. 
		
		System.out.println("Check to see if a number is prime.");
		int userRequest = in.nextInt();	
		
		/* build the array. */
		int checkArray[] = new int [userRequest-2]; 
		for(int i = 0; i < userRequest-2; ++i) { // avoids the zero error.
			checkArray[i] = i+2; // avoids errors
		}
		
		/* loop to control the checking */
		for(int i = 0; i < checkArray.length; ++i) {
			if(userRequest % checkArray[i] == 0 && userRequest != checkArray[i] ) {
				System.out.println(userRequest + " is divisable by " + checkArray[i] + ".");
				prime = false;
			}
		}
		
		if(prime) {
			System.out.println(userRequest + " is prime.");
		}
		
		in.close(); // closes the scanner.
		System.out.println("terminated.");
	}
}
