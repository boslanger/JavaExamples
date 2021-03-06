/*
 * 20190501
 * Coding Challenge - Change maker
 * The purpose is to take two values, a total and amount paid, and then count out the correct change.
 * The output displays the quantity of dollars, quarters, nickels, dimes, and pennies.
 * I use nested if statements to keep the output clean. 
 */


public class changeMaker {

	public static void main(String[] args) {
		//variables to hold the money
		int dollars = 0, quarters = 0, nickels = 0, dimes = 0, pennies = 0;
		
		// This can easily be changed to user input values. 
		double totalDue = 1.35;
		double totalPaid = 2.00;
		
		// converts the difference into a more accurate integer value. 
		double difference = (totalPaid * 100 - totalDue * 100);
		Double doubleDifference = difference; // necessary to change the double difference to int intDifference
		int intDifference = doubleDifference.intValue(); // now i have an integer value of the difference.  

		// start the conversion process counting up to the correct change amount. 
		while(intDifference > 0) {
			//dollars
			
			if(intDifference >= 100) {
				dollars += 1;
				intDifference -= 100;					
			}
			//quarters
			else if(intDifference >= 25) {
				quarters += 1;
				intDifference -= 25;					
			}
			//dimes
			else if(intDifference >= 10) {
				dimes += 1;
				intDifference -= 10;					
			}
			//nickels
			else if(intDifference >= 5) {
				nickels += 1;
				intDifference -= 5;					
			}
			//pennies
			else if(intDifference >= 1) {
				pennies += 1;
				intDifference -= 1;					
			}
		}
		
		// the output process. The goal is to keep the output clean and clear.
		if(dollars > 0) {
			if(dollars == 1) {
				System.out.println(dollars + " dollar");
			} else {
				System.out.println(dollars + " dollars");
			}
		}
		if(quarters > 0) {
			if(quarters == 1) {
				System.out.println(quarters + " quarter");
			} else {
				System.out.println(quarters + " quarters");
			}
		}
		if(dimes > 0) {
			if(dimes == 1) {
				System.out.println(dimes + " dime");
			} else {
				System.out.println(dimes + " dimes");
			}	
		}
		if(nickels > 0) {
			if(nickels == 1) {
				System.out.println(nickels + " nickel");
			} else {
				System.out.println(nickels + " nickels");
			}	
		}
		if(pennies> 0) {
			if(pennies == 1) {
				System.out.println(pennies + " penny");
			} else {
				System.out.println(pennies + " pennies");
			}
		}
	
		System.out.println("\nTotal change: " + difference/100);

	}
}
