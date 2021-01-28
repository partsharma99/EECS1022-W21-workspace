package model;

public class Grade {
	public static String getGradeReport(int marks) {
		String report = "";
		
		String lg = getLetterGrade1(marks);
//		boolean didWell = lg.equals("A+")|| lg.equals("A")||lg.equals("B+")||lg.equals("B")||lg.equals("C+")||lg.equals("C");
		boolean didWell = !(lg.equals("D+")|| lg.equals("D") || lg.equals("F"));
		if(didWell) {
			report += "Grade " + lg + ": Well Done!";
		}
		else {
			report += "Grade " + lg + ": You can do better next time";
			
		}
		
		
		return report;
	}
	
	
	
	public static String getLetterGrade1(int marks) {
		String lg = "";
		// Version-1: Correct with only one if statement
		if(marks >= 90) {
			lg = "A+";
			
		}
		else if(marks >= 80) {
			lg = "A";
		}
		else if(marks >= 75) {
			lg = "B+";
		}
		else if(marks >= 70) {
			lg = "B";
		}
		else if(marks >= 65) {
			lg = "C+";
		}
		else if(marks >= 60) {
			lg = "C";
		}
		else if(marks >= 55) {
			lg = "D+";
		}
		else if(marks >= 50) {
			lg = "D";
		}
		else {
			lg = "F";
		}
		return lg;
	}
	


	
	public static String getLetterGrade2(int marks) {
		String lg = "";
		// Version-2: Incorrect with overlapping conditions
//		if(marks >= 90) {
//			lg = "A+";
//			
//		}
//		if(marks >= 80) {
//			lg = "A";
//		}
//		if(marks >= 75) {
//			lg = "B+";
//		}
//		if(marks >= 70) {
//			lg = "B";
//		}
//		if(marks >= 65) {
//			lg = "C+";
//		}
//		if(marks >= 60) {
//			lg = "C";
//		}
//		if(marks >= 55) {
//			lg = "D+";
//		}
//	    if(marks >= 50) {
//			lg = "D";
//		}
//		if(marks < 50) {
//			lg = "F";
//		}
		
		// Version-3: Correct with multiple if statements and no overlapping conditions 
		if(90 <= marks && marks <=100) {
			lg = "A+";
			
		}
		if(80 <= marks && marks < 90) {
			lg = "A";
		}
	    if(75 <= marks && marks < 80) {
			lg = "B+";
		}
		if(70 <= marks && marks < 75) {
			lg = "B";
		}
		if(65 <= marks && marks < 70) {
			lg = "C+";
		}

		if(60 <= marks && marks < 65) {
			lg = "C";
		}
		if(55 <= marks && marks < 60) {
			lg = "D+";
		}
		if(50 <= marks && marks < 55) {
			lg = "D";
		}
		if(0 <= marks && marks < 50) {
			lg = "F";}
		return lg;
	}
		
		
	
		// Version-4: Incorrect- Version-3 where conjuction is replaced by disjunction
//		if(90 <= marks || marks <=100) {
//			lg = "A+";
//			
//		}
//		if(80 <= marks || marks < 90) {
//			lg = "A";
//		}
//	    if(75 <= marks || marks < 80) {
//			lg = "B+";
//		}
//		if(70 <= marks || marks < 75) {
//			lg = "B";
//		}
//		if(65 <= marks || marks < 70) {
//			lg = "C+";
//		}
//
//		if(60 <= marks || marks < 65) {
//			lg = "C";
//		}
//		if(55 <= marks || marks < 60) {
//			lg = "D+";
//		}
//		if(50 <= marks || marks < 55) {
//			lg = "D";
//		}
//		if(0 <= marks || marks < 50) {
//			lg = "F";
//		}
//		
//		else {
//			lg = "F";
//		}
		public static String getLetterGrade3(int marks) {
			String lg = "";
			// Version-5: Correct with nested if statement
			
			if(marks >= 80) {
				if(marks >= 90) {
					lg = "A+";	
				}
				else {
				lg = "A";
				}
			}
			else if(marks >= 75) {
				
				lg = "B+";
			}
				
			
			else if(marks >= 55) {
				if(marks >= 70) {
					lg = "B";
				}
				else if(marks >= 65) {
					lg = "C+";
				}
				else if(marks >= 60) {
					lg = "C";
				}
				else {
				lg = "D+";
				}
			}
			
			else if(marks >= 50) {
				lg = "D";
			}
			else {
				lg = "F";
			}
			return lg;
		}
	}
		
