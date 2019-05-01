/*
 * 20190501
 * Coding challenge - echo.
 * just a very basic echo script.
 */

import java.util.Scanner;

public class echo {
	
	public static void main(String[] args) {
		// A basic name echo.
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = in.nextLine();
		System.out.println("\nYour first name is " + firstName);
		
		System.out.println("What is your last name?");
		String lastName = in.nextLine();
		System.out.println("\nYour name is " + firstName + " " + lastName);
		
		
		// starting a loop to echo.
		System.out.println("You approach a large crevasse.");
		
		boolean flag = false; // controls the loop.
		
		while (!flag) {
			System.out.println("What do you say?(q to quit)");
			String echo = in.nextLine();
			System.out.println(echo);
			
			if(echo.equalsIgnoreCase("q")) 
				{ 
				flag = true; // stops the loop.  
				}
		}
		
		System.out.println("terminated."); // proves the loop has ended.
		in.close(); // closes the scanner class.
		
	}
}
