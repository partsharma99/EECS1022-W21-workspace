package console_apps;

import java.util.Scanner;
import model.Grade;

public class GradeApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a raw  mark score (from 0 to 100):");
		int marks = input.nextInt();
		/*In principle, we call only one method from console application*/
		String report = Grade.getGradeReport(marks);
		
		System.out.println(report);
		
		input.close();
	}

}
 