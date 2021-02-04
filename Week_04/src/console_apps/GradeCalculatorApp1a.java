package console_apps;

import java.util.Scanner;
/*
 * Calculate the weighted sum of 5 assignments, each may come witha a different weight.
 * eg. Assignment 1(20%) has 50 marks and Assignment 2 (40%) has 70 marks
 * Weighted sum : 50 * 0.2 + 70 * 0.4 = 10 + 28 = 38
 * */


public class GradeCalculatorApp1a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your name:");
		String name = input.nextLine();
		System.out.println(name + " , whats's the weight pf your Assinment 1?");
		int weight1 = input.nextInt();
		System.out.println(name + " , what's the marks of your Assignment 1 (out of a 100)?");
		int marks1 = input.nextInt();
		System.out.println(name + " , whats's the weight pf your Assinment 2?");
		int weight2 = input.nextInt();
		System.out.println(name + " , what's the marks of your Assignment 2 (out of a 100)?");
		int marks2 = input.nextInt();
		System.out.println(name + " , whats's the weight pf your Assinment 3?");
		int weight3 = input.nextInt();
		System.out.println(name + " , what's the marks of your Assignment 3 (out of a 100)?");
		int marks3 = input.nextInt();
		System.out.println(name + " , whats's the weight pf your Assinment 4?");
		int weight4 = input.nextInt();
		System.out.println(name + " , what's the marks of your Assignment 4 (out of a 100)?");
		int marks4 = input.nextInt();
		System.out.println(name + " , whats's the weight pf your Assinment 5?");
		int weight5 = input.nextInt();
		System.out.println(name + " , what's the marks of your Assignment 5 (out of a 100)?");
		int marks5 = input.nextInt();
		
		double weightedSum = marks1 * (weight1/100.0) + marks2 * (weight2/100.0) + marks3 * (weight3/100.0) + marks4 * (weight4/100.0) + marks5 * (weight5/100.0);
	    System.out.println("Assignment 1 [" + marks1 + " ;" + weight1 + "%]");
	    System.out.println("Assignment 2 [" + marks1 + " ;" + weight1 + "%]");
	    System.out.println("Assignment 3 [" + marks1 + " ;" + weight1 + "%]");
	    System.out.println("Assignment 4 [" + marks1 + " ;" + weight1 + "%]");
	    System.out.println("Assignment 5 [" + marks1 + " ;" + weight1 + "%]");
	    System.out.println("Weighted Sum: " + weightedSum);
	    
				input.close();
		
	}

}
