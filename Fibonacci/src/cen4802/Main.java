package cen4802;

import java.util.Scanner;

public class Main {
	
	public static int recursiveFib(int n) {
	
		if ((n == 0) || (n == 1))
	         return n;
	      else
	         return recursiveFib(n - 1) + recursiveFib(n - 2);
	}

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter q to quit.");
		String input;
		int n = 0;
		while (true) {
			System.out.println("Enter an integer: ");
			input = scan.nextLine();
			if (input.equalsIgnoreCase("q")) {
				System.out.println("Quitting...");
				break;
			} else {
				n = Integer.valueOf(input);		
				int result = recursiveFib(n);
				System.out.println("The nth term of the Fibonacci sequence is " + result + ".");
			}
		}
	}
}

