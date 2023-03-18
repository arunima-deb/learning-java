package com.arunima.basics.console;

// Import the Scanner class from java.util package.
import java.util.Scanner ;

public class ConsoleInputOutput {

	public static void main(String[] args) {
		ConsoleInputOutput app = new ConsoleInputOutput() ;
		//app.exercise01() ;
		//app.exercise02() ;
		app.exercise03() ;
	}
	
	/**
	 * Show a prompt on the screen which reads "Input a number:".
	 * Once the user enters a number, print double the number 
	 * on the screen.
	 */
	public void exercise01() {
		
		// Display the prompt on the screen
		System.out.print( "Input a number : " ) ;
		
		// Read the input from the user.
		//   1. Create a Scanner instance
		//   2. Use the nextInt() method to read an integer
		//   3. Store the integer in a variable.
		Scanner scanner = new Scanner( System.in ) ;
		int number = scanner.nextInt() ;
		
		// Print double the number on the screen
		System.out.print( "Double the number entered is = " + 2*number );
		
		// Close the scanner instance.
		scanner.close() ;
	}
	
	/**
	 * This is an intelligent and friendly computer program, which tries to 
	 * make friends by asking questions and replying.
	 * 
	 * Once the program is run, computer says - 
	 * "Hi there!. My name is Progy. What is yours?"
	 * 
	 * It waits for the user to enter their name. Then the program says,
	 * "Hi <user name>! So good to meet you!"
	 */
	public void exercise02() {
		
		// Display the prompt on screen
		System.out.println( "Hi there! My name is Progy. What is yours?" );
		
		// Process user's input
		Scanner scanner = new Scanner( System.in );
		String userName = scanner.next() ;
		
		// Print second prompt on screen
		System.out.print( "Hi " +  userName + "! So good to meet you!" );
		
		// Close the scanner instance
		scanner.close();
	}
	
	/**
	 * This is an intelligent and friendly computer program, which tries to 
	 * make friends by asking questions and replying.
	 * 
	 * Once the program is run, computer says - 
	 * "Hi there!. My name is Progy. What is yours?"
	 * 
	 * It waits for the user to enter their name. Then the program says,
	 * "Hi <user name>! Good evening/Good morning... how are you doing today?"
	 * 
	 * Note that the program is able to intelligently decide whether to 
	 * wish good morning/good evening or good afternoon based on the time of 
	 * the day.
	 * 
	 * 0000-1159 : morning
	 * 1200-1659 : afternoon
	 * 1700-2359 : evening
	 */
	public void exercise03() {
		
	}
}

