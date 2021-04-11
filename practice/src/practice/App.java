package practice;

public class App {
	String str = "";
	String[][] a = {{"hello", "EECS", "york"},
			{"how", "are", "you"}};
	for (int r = 0; r<a.length; r++) {
		for (int c = 0; c<a[r].length;c++) {
			if (a[r][c].indexOf('o')!= -1) {
				str+=a[r][c];
			}
		}
			
	}
	
	
		
		
	



