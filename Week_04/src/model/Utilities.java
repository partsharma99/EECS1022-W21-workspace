package model;

public class Utilities {
	public static String getSequence1a(int ft, int d, int n) {
		String result = "";
		
		int term = ft;
		result += "<";
		int sum = 0;
		for(int i =1; i<= n; i++) {
			result += term;
			if(i < n) {//not the last term in the sequence
				result += ", ";
			}
			sum += term;
			term += d; // term = term +d
		}
		result += ">";
		result += " has average " + ((double)sum / n); //casting (double) has a higher precidence than the devision
		return result;
	}
	public static String getSequence1b(int ft, int d, int n) {
		String result = "";
		
		int term = ft;
		result += "<";
		int sum = 0;
		int i =1;
		while(i<= n) {
			result += term;
			if(i < n) {//not the last term in the sequence
				result += ", ";
			}
			sum += term;
			term += d; // term = term +d
			i++;
		}
		result += ">";
		result += " has average " + ((double)sum / n); //casting (double) has a higher precidence than the devision
		
		return result;
	}
	public static String getSequence2b(int ft, int d, int max) {
		String result = "";
		
		int term = ft;
		result += "<";
		int sum = 0;
		int i =1;
		int n = 0;
		while(term <= max){// exiting from the loop means: !(term <= max) in the case (i.e. term > max)
			n++;
			result += term;
			result += " ";
				
			
			sum += term;
			term += d; // term = term +d
			i++;
		}
		result += ">";
		result += " has average " + ((double)sum / n); //casting (double) has a higher precidence than the devision
		
		return result;
	}
	public static String getSequence2a(int ft, int d, int max) {
		String result = "";
		
		int term = ft;
		result += "<";
		int sum = 0;
	
		int n = 0;
		for(;term <= max;){// exiting from the loop means: !(term <= max) in the case (i.e. term > max)
			n++;
			result += term;
			result += " ";
				
			
			sum += term;
			term += d; // term = term +d
			
		}
		result += ">";
		result += " has average " + ((double)sum / n); //casting (double) has a higher precidence than the devision
		
		return result;
	}

}
