package cen4802;

import java.util.Scanner;

/**
* The recursiveFib method uses recursion to return the nth term of the Fibonacci sequence.
* The main method scans for input and loops through every integer entered
* until the quit command "q" is entered. 

* @author	Amanda Brown
* 
*/

public class Main {
	
/**
 * recursiveFib takes an integer parameter to return the corresponding value in the Fibonacci sequence.
 * 
 * @param n integer used to calculate the nth term of the Fibonacci sequence
 * @return final value of the Fibonacci sequence
 */
	public static int recursiveFib(int n) {
	
		if ((n == 0) || (n == 1))
	         return n;
	      else
	         return recursiveFib(n - 1) + recursiveFib(n - 2);
	}

/** 
* Reads input from user through the Scanner utility. If the input is not "q" the program will continuously
* ask for new input. If a negative value or a value larger than 45 is entered, the program will ask for
* a new integer. If an integer is not provided or "q" is entered, the program will terminate.
* 
*/
	public static void main(String[] args) {
		
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
			} if (Integer.valueOf(input) < 0 || Integer.valueOf(input) > 45) {
				System.out.println("Invalid input or input is too large.\n");
			} else {
				n = Integer.valueOf(input);	
				int result = recursiveFib(n);
				System.out.println("The nth term of the Fibonacci sequence is " + result + ".\n");
			}
		}
	}
}

