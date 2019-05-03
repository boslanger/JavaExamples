/*
 * 20190502
 * Coding challenge - Is the number prime?
 *  TODO: 
 *  - add a input error statement block.
 */

import java.time.Instant;
import java.util.Scanner;


/* takes a user supplied integer and determines all divisors and if it is prime.
 * int 100,000 time tested at 25-30 milliseconds.
 * int 1,000,000 time tested at 30-35 milliseconds.
 * int 1,000,000,000 time tested at 3200 - 3220 milliseconds. 
 */
public class isPrime {
	
	public static void main(String[] args) {
		long startTime = Instant.now().toEpochMilli(); // start timing
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Check to see if a number is prime.");
//		int userRequest = in.nextInt();	
		int userRequest = 1_000_000_000;	
		
		boolean prime = true;
		/* I found this loop to be much faster at higher numbers */
		for(int i = 2; i < userRequest; ++i) { // start on 2 because 1 divides into everything.
			if(userRequest % i == 0) {
				prime = false;
				System.out.println(userRequest + " is divisable by " + i + ".");
			}
			if(prime) {
				System.out.println(userRequest + " is prime.");
				break;
			}	
		}

		long endTime = Instant.now().toEpochMilli(); // stop timing
		long timeElapsed = endTime - startTime; 
		in.close(); // closes the scanner.
		
		System.out.println(timeElapsed + " milliseconds"); // displays the speed of execution. 
		System.out.println("terminated.");
	}
}
