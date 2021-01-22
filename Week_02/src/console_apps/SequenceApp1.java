package console_apps;

import java.util.Scanner;

import model.Sequence;

public class SequenceApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Stage 1: Prompt the user and read inputs
		System.out.println("Enter the first term (FT) of the arithmetic seq. of size 5:");
		int ft = input.nextInt();
		System.out.println("Enter the common difference (d): ");
		int d = input.nextInt();
		
		// Stage 2: Compute the result
//		int term1 = ft;
//		int term2 = term1 + d;
//		int term3 = term2 + d;
//		int term4 = term3 + d;
//		int term5 = term4 + d;
		String seq = Sequence.getSequence1(ft, d);
		int sum = Sequence.getSum1(ft, d);
		System.out.println("Sequence " + seq + "has sum " + sum);
		// Stage 3: Output the result to the console
		
		
		

		
		input.close();
	}

}
