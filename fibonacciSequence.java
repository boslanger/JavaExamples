/*
 * 20190430
 * Challenge: Fibonacci's sequence.
 * I have added additional information; the total and the average.
 */


public class fibonacci {
	public static void main(String[] args) {
		
		int maxLength = 40; // using the integer type the max length is 46, 40 because of the average.
		int fibArray[] = new int[maxLength+2]; // adding two because I establish the first to indices.
		long sumArray = 0; // holds the total for calculations.
		
		fibArray[0] = 1; // I don't like the way these two lines look.
		fibArray[1] = 1;
		
		for (int i = 0; i < maxLength; i++)
			{
			fibArray[i+2] = fibArray[i] + fibArray[i+1]; // adding up keeps those ceiling errors away.
			System.out.println("index number: " + i + " | " + fibArray[i]);
			}
		
		for (int i = 0; i < maxLength; i++) 
			{
			sumArray += fibArray[i]; // This adds the given index to the total.
			}
		
		double avgArray = sumArray / maxLength;
		System.out.println("\nThe total of the given length, " + maxLength + ", is: " + sumArray);
		System.out.println("The average of the sequence is: " + avgArray);
	
	}
}
