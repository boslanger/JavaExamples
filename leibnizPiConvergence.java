/**
 * 20190430
 * Representation of Leibniz's Pi Convergence.
 * 1 - 1/3 + 1/5 -1/7 + 1/9 ... = pi/4
 * pi = 3.141592653589793...
 * according to piday.org/million.
 * Due to the primitive data types, this is not as accurate as I would like it to be. 
 */


public class leibnizPiConvergence {

	public static void main(String[] args) {
		
		double pi = 3.141592653589793;
		int iterations = 1_000_000;
		double sumLeibniz = 1.0; // double precision to 15 to 16 decimal places.
		double denominator = 3.0;
		
		for (int i = 2; i < iterations+2; i++) 
			{
			if (i % 2 == 0) {
				sumLeibniz = sumLeibniz - (1 / denominator);
				denominator += 2;
			} else {
				sumLeibniz = sumLeibniz + (1 / denominator);
				denominator += 2;
			}
		}
		
		double piLeibniz = sumLeibniz * 4; 
		System.out.println("Leibniz's Pi Convergence to " + iterations + " places is:\n" + piLeibniz);
		System.out.println("Pi is approximately:\n" + pi); 
		
	}
}
	
