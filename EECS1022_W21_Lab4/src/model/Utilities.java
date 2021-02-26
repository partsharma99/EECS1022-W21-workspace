package model;

import java.util.Arrays;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	
	public static int[] getMultiplesOf3(int[] numbers) {
		int temp = 0;
		int count = 0;
		int[] result = null;
		for(int i: numbers) {
			if(i % 3 == 0) {
				temp++;
			}
			
		}
		result = new int[temp];
		for(int i: numbers) {
			if(i % 3 == 0) {
				result[count] = i;
				count++;
			}
			
		}
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int temp = 0;
		int count = 0;
		for(int i: numbers) {
			if(i != n) {
				temp++;
			}
			
		}
		result = new int[temp];
		for(int i: numbers) {
			if(i != n) {
				result[count] = i;
				count++;
			}
			
		}
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
	    String[] result = new String[numbers.length];
		String temp = "";
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		for(int i = 0; i < numbers.length; i++) {
			temp = ""; 
			temp += "[";
			for(int j = 0; j <= i; j++) {
			temp += numbers[j];
			if(j < i) {
				temp += ", ";
			}
			}
			temp += "]";
			result[i] = temp;
		}
	
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int count = 0;
		
		result = new int[numbers.length];
		for(int i: numbers) {
			if(i % 3 == 0) {
				result[count] = i;
				count++;
			}
			
		}
		for(int i: numbers) {
			if(i % 3 == 1) {
				result[count] = i;
				count++;
			}
			
		}
		
		for(int i: numbers) {
			if(i % 3 == 2) {
				result[count] = i;
				count++;
			}
			
		}
		
		
		/* Your implementation ends here. */
		
		return result;
	}
}
