package console_apps;

import java.util.Scanner;

public class App {
//	public static int aMethod(int x, int y) {
//		x *= 2;
//		y = x / y;
//		return x + y;
	
//		System.out.println("A");
//		bMethod();
//	}
//	public static void bMethod() {
//		System.out.println("B");
//		cMethod();
//	}
//	public static void cMethod() {
//		System.out.println("c");
//		
//	}

	public static void main(String[] args) {
		int n = 10;
		char code = 'e';
		switch (code) {
		case 'a':
		case 'A':
			n+= 1;
			break;
		case 'b':
		case 'B':
			n -= 2;
			break;
		case 'c':
		case 'C' :
			n += 2;
			break;
			default:
				n = 13;
		//		switch(n) {
//		case 10 : n = n + 5;
//		case 15 : n = n + 5;
//		case 20 : n = n - 3;
//		case 25 : n = n + 4;
//		case 30 : n = n - 5;
		
		}
		System.out.println(n);
//		int b = 1022;
//		int a = 5;
//		String str5 = a + b + "$";
//		String str8 = "%" + a + b;
//		String str6 = "$" + b + a + "%";
//		System.out.println(str6);
//		int x = 2;
//		int y = 1;
//		x = aMethod(x,y);
//		System.out.println(x + "," + y);
//		y = aMethod(y+x , x);
//		System.out.println(x + "," + y);
////		aMethod();
//		bMethod();
//		cMethod();

		
		/*
		 * Your submission will only be graded against JUnit tests.
		 * 
		 * If you wish to test your utility methods quickly,
		 * you may use this console application class by calling them.
		 * 
		 * However, you must make sure that you do not introduce 
		 * any compilation errors here. 
		 * 
		 * Reminders:
		 *  - Write `System.out.println` to prompt user inputs and output result to the console. 
		 * 	- Write `input.nextInt()` to read an integer from user.
		 *  - Write `input.nextDouble()` to read a double from user.   
		 */
		
//		input.close();
	}

}
