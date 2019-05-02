/*
 * 20190502 
 * Coding Challenge - Random walk
 * 
 * TODO:
 * - plot this out graphically.
 * - find the limit of how far a walk can go and still be 
 *   a predetermined distance from the starting location.
 */

import java.util.Random;

public class RandomWalks {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = 0; // holds the total x value
		int y = 0; // holds the total y value
		int walkIterations = 100;
		
		for (int i = 0; i < walkIterations; ++i) {
			int outcome = rand.nextInt(5);
				switch (outcome) { 
				case 1: 
					x += 1;
					y += 1;
					break;
				case 2:
					x += 1;
					y -= 1;
					break;
				case 3:
					x -= 1;
					y += 1;
					break;
				default:
					x -= 1;
					y -= 1;
					break;
				}
			System.out.println("choice:" + outcome);	
			System.out.println("iteration number:(" + i + ") coords: " + x + "|" + y);		
		}
	
		System.out.println("Terminal destination: " + x + "|" + y);
		
	}
}

