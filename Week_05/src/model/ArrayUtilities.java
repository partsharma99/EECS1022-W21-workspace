package model;

public class ArrayUtilities {
	/*
	 * e.g., Given <2,3,4>, return the sums for the sub-arrays: <2,5,9>
	 */
	public static int[] getIntermediateSums(int[] ns) {
		int[] result = new int[ns.length]; // array variable syores no address
		
		int sum = 0;
		
		for(int i= 0; i < ns.length; i++) {
			sum += ns[i];
			result[i] = sum;
		}
		
		return result;
	}

}
