package console_apps;

import java.util.Scanner;
/*
 * Calculate the weighted sum of 5 assignments, each may come witha a different weight.
 * eg. Assignment 1(20%) has 50 marks and Assignment 2 (40%) has 70 marks
 * Weighted sum : 50 * 0.2 + 70 * 0.4 = 10 + 28 = 38
 * */


public class GradeCalculatorApp3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your name:");
		String name = input.nextLine();
		
		double weightedSum = 0.0;
		String report = "";
		int i= 1;
		boolean userWantsToContinue = true;
		while(userWantsToContinue) {
			/*
			 * Known issue for Scanner:
			 * When a string (Input.nextLine())  is expected to be read after an integer (input.nextInt()),
			 * we must consume the lines for every integer reading.
			 */
			System.out.println(name + " , whats's the weight of your Assinment " + i + "?");
			int weight = input.nextInt();
			input.nextLine();//consume the new line character
			System.out.println(name + " , what's the marks of your Assignment " + i + " (out of a 100)?");
			int marks = input.nextInt();
			input.nextLine();
			report += "Assignment " + i + "[" + marks + " , " + weight + "%]";
		//	if (i<=4) {// In this extended version, the number of assignments is undefined
				report += "\n";
			weightedSum = weightedSum + marks * (weight/100.0);
			i++;
			
			System.out.println("Would you like to continue? (Y for yes, otherwise no)");
			String answer = input.nextLine();
			userWantsToContinue = answer.equals("Y");
			}
		System.out.println(report);
		System.out.println("Weighted Sum: " + weightedSum);
		    
		
		
	    
				input.close();
		
	}

}
