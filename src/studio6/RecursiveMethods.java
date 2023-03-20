package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			if (n == 0) {
				return 0;
			}
			else {
				return (geometricSum(n-1))+Math.pow(1.0/2.0, n);
			}
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
			if (q == 0) {
				return p;
			}
			else {
				return gcd(q,p%q);
			}
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] helper(int[]array, int[]reversed, int index) {
		if (index<=array.length/2) {
			reversed[index]=array[array.length - 1 - index];
			reversed[array.length - 1 - index]=array[index];
			index ++;
			return helper(array,reversed,index);
		}
		else
			return reversed;
	}
	public static int[] toReversed(int[] array) {
		if (array.length > 0) {
			int [] reversed = new int [array.length];
			return helper(array,reversed,0);
		}
		return new int [0];
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
