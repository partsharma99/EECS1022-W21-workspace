package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";
		double tax = 0;
		double tax1 = 0;
		double tax2 = 0;
		double tax3 = 0;
        int income1 = 0;
		int income2 = 0;
		int income3 = 0;
		if(status !=2 || status!=1) {
			result = "Illegal Status: " + status;
		}
		if(status > 0 && status <= 2) {
			if(status == 1) {
				if(8350 >= income) {
					tax = 0.1 * income;
					
					result = "Single Filing: $" + String.format("%.2f", tax) + " (Part I: $" + String.format("%.2f", tax) + ")";
				}
				else if(income >= 8351 && 33950 >= income) {
					income1 = 8350;
					income2 = income - 8350;
					tax1 = 0.1 * 8350;
					tax2 = 0.15 * income2;
					tax = tax1 + tax2;

					result = "Single Filing: $" + String.format("%.2f", tax) + " (Part I: $" + String.format("%.2f", tax1) + ", " +  "Part II: $" + String.format("%.2f", tax2) +")";
							
				}
				else if(income > 33950) {
					income1 = 8350;
					income2 = 33950 - income1;
					income3 = income - 33950;
					tax1 = 0.1 * 8350;
					tax2 = 0.15 * income2;
					tax3 = 0.25 * income3;
					tax = tax1 + tax2 + tax3;
					
					
					
					String.format("%.2f", tax3);
					result = "Single Filing: $" + String.format("%.2f", tax) + " (Part I: $" + String.format("%.2f", tax1) + ", " +  "Part II: $" + String.format("%.2f", tax2) + ", " + "Part III: $" + String.format("%.2f", tax3) +")";
				}
			}
			if(status == 2) {
				if(16700 >= income) {
					tax = 0.1 * income;
					
					result = "Married Filing: $" + String.format("%.2f", tax) + " (Part I: $" + String.format("%.2f", tax) + ")";
				}
				else if(income >= 16701 && 67900 >= income) {
					income1 = 16700;
					income2 = income - 16700;
					tax1 = 0.1 * income1;
					tax2 = 0.15 * income2;
					tax = tax1 + tax2;
					result = "Married Filing: $" + String.format("%.2f", tax) + " (Part I: $" + String.format("%.2f", tax1) + ", " +  "Part II: $" + String.format("%.2f", tax2) +")";		
				}
				else if(income > 67900) {
					income1 = 16700;
					income2 = 67900 - income1;
					income3 = income - 67900;
					tax1 = 0.1 * income1;
					tax2 = 0.15 * income2;
					tax3 = 0.25 * income3;
					tax = tax1 + tax2 + tax3;
					
					result =  ("Married Filing: $" + String.format("%.2f", tax) + " (Part I: $" + String.format("%.2f", tax1) + ", " +  "Part II: $" + String.format("%.2f", tax2) + ", " + "Part III: $" + String.format("%.2f", tax3) +")");
				}
				
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
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		String result1 = "";
		String result2 = "";
		//Round1:
		if(p1r1 == p2r1) {
			result1 = "Draw";
		}
		else if(p1r1 == 'R' && p2r1 == 'S') {
			 
				result1 = "p1 wins";
			
		}
		else if(p1r1 == 'S' && p2r1 == 'P') {
			result1 = "p1 wins";
		}
		else if(p1r1 == 'P' && p2r1 == 'R' ) {
			result1 = "p1 wins";
		}
		else if(p2r1 == 'R' && p1r1 == 'S') {
			 
			result1 = "p2 wins";
		
	   }
	   else if(p2r1 == 'S' && p1r1 == 'P') {
		    result1 = "p2 wins";
	   }
	   else if(p2r1 == 'P' && p1r1 == 'R' ) {
		    result1 = "p2 wins";
	   }
		
		// Round2:
		if(p1r2 == p2r2) {
			result2 = "Draw";
		}
		else if(p1r2 == 'R' && p2r2 == 'S') {
			 
				result2 = "p1 wins";
			
		}
		else if(p1r2 == 'S' && p2r2 == 'P') {
			result2 = "p1 wins";
		}
		else if(p1r2 == 'P' && p2r2 == 'R' ) {
			result2 = "p1 wins";
		}
		else if(p2r2 == 'R' && p1r2 == 'S') {
			 
			result2 = "p2 wins";
		
	}
	else if(p2r2 == 'S' && p1r2 == 'P') {
		result2 = "p2 wins";
	}
	else if(p2r2 == 'P' && p1r2 == 'R' ) {
		result2 = "p2 wins";
	}
	
		if (result1.equals("Draw") && result2.equals("Draw")) {
			result = "Game over: Tie!" + " [Round 1: " + "Tie " + '(' + p1r1 + " vs. " + p2r1 + ") ; " +  "Round 2: " + "Tie "+  '(' + p1r2 + " vs. " + p2r2 + ")]";
			
		}
		else if(result1.equals("p1 wins") && result2.equals("p2 wins")) {
			result = "Game over: Tie!" + " [Round 1: " + p1 + " wins " + '(' + p1r1 + " vs. " + p2r1 + ") ; " +  "Round 2: " + p2 + " wins "+  '(' + p2r2 + " vs. " + p1r2 + ")]";
			
		}
		else if(result1.equals("p2 wins") && result2.equals("p1 wins")) {
			result = "Game over: Tie!" + " [Round 1: " + p2 + " wins " + '(' + p2r1 + " vs. " + p1r1 + ") ; " +  "Round 2: " + p1 + " wins "+  '(' + p1r2 + " vs. " + p2r2 + ")]";
			
		}
		else if(result1.equals("p1 wins") && result2.equals("p1 wins")) {
			result = "Game over: " + p1 + " wins!" + " [Round 1: " + p1 + " wins " +  '(' + p1r1 + " vs. " + p2r1 + ") ; " +  "Round 2: " + p1 +  " wins " +  '(' + p1r2 + " vs. " + p2r2 + ")]";
		}
		
		else if(result1.equals("p1 wins") && result2.equals("Draw")) {
			result = "Game over: " + p1 + " wins!" + " [Round 1: " + p1 + " wins " +  '(' + p1r1 + " vs. " + p2r1 + ") ; " +  "Round 2: " + "Tie "+  '(' + p1r2 + " vs. " + p2r2 + ")]";
		}
		else if(result1.equals("p2 wins") && result2.equals("p2 wins")) {
			result = "Game over: " + p2 + " wins!" + " [Round 1: " + p2 + " wins " +  '(' + p2r1 + " vs. " + p1r1 + ") ; " +  "Round 2: " + p2 +  " wins " +  '(' + p2r2 + " vs. " + p1r2 + ")]";
		}
		else if(result1.equals("p2 wins") && result2.equals("Draw")) {
			result = "Game over: " + p2 + " wins!" + " [Round 1: " + p2 + " wins " +  '(' + p2r1 + " vs. " + p1r1 + ") ; " +  "Round 2: " + "Tie "+  '(' + p1r2 + " vs. " + p2r2 + ")]";
		}
		else if(result1.equals("Draw") && result2.equals("p1 wins")) {
			result = "Game over: "+  p1 + " wins!" + " [Round 1: " + "Tie " + '(' + p1r1 + " vs. " + p2r1 + ") ; " +  "Round 2: " + p1 +  " wins " +  '(' + p1r2 + " vs. " + p2r2 + ")]";
		}
		else if(result1.equals("Draw") && result2.equals("p2 wins")) {
			result = "Game over: " + p2 + " wins!" + " [Round 1: " + "Tie " + '(' + p1r1 + " vs. " + p2r1 + ") ; " +  "Round 2: " + p2 +  " wins " +  '(' + p2r2 + " vs. " + p1r2 + ")]";
		}
		
		
	
		
		/* Your implementation ends here. */;

		return result;
	}
}
