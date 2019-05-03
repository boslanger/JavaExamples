/**
 * 20190503
 * 
 * Coding challenge - list of primes with a given range.
 * The user gives an integer and the script outputs all primes 
 * up to the user's request.
 *
 */
import java.util.Scanner;

public class PrimeList {
	public static Scanner in = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Input max number to check for prime?");
		int userRequest = in.nextInt();
		
		int[] primeArray = new int [userRequest];
		int j = 0; // variable to front the primes and clean the output.
		
		for(int i = 1; i < userRequest; ++i) {
			if(checkPrime(i)) {
				primeArray[j] = i;
				++j;
			}
		}
		
		for(int i = 0; i < primeArray.length; ++i) {
			if(primeArray[i] != 0) {
				System.out.println(primeArray[i]);
			}
		}
		
		in.close(); // closes the scanner.
		System.out.println("\nterminated.");
	}
		
	
	/* Checks for prime returns t/f 
	 * The main purpose of this is to keep the code tidy. */
	public static  boolean checkPrime(int x) {
		boolean prime = true;
		
		/* I found this loop to be much faster at higher numbers */
		for(int i = 2; i < x; ++i) { // start on 2 because 1 divides into everything.
			if(x % i == 0) {
				prime = false;
			} // would a while statement be faster?
		}
		return prime;
	}

	
}
