package practice;

public class App {

	public static void main(String[] args) {
		int[] seq = {1, 2, 3, 4, 5};
	    int n =1;
		int[] result = new int[seq.length];
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < seq.length; j++) {
				result[j] = seq[(j + seq.length- i)%seq.length];
			}
			for(int z = 0; z < seq.length; z++) {
				seq[z]= result[z];
			}
			
		}
			for( int i = 0; i < seq.length; i++) {
				System.out.println(result[i]);
			}
			

	}
		
		
	}



