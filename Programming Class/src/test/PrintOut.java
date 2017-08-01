package test;

import java.util.Scanner;

public class PrintOut {

	static int count = 0;
	
	public static void main(String args []) {
		//If we haven't, do introductions:
		
		//Name
		//Favorite Color
		//Favorite Hobby
		//Why are they interested in this class? 
		
		
		//Basic Printout
		int testInteger = 10;
		System.out.println("Hello World");
		
		
		//Show them printing integers and variables 
		//and joining them into strings
		System.out.println(testInteger);
		System.out.println("My integer is: " + testInteger);
		
		
		//Make Printout Method
		printOut("Hello");
		
		
		//Scanner stuff next, teach them how to take input and then
		//print it with an echo
		
		//Basic Scanner
//		Scanner s = new Scanner(System.in);
//		String input = s.next();		
//		System.out.println(input);
//		s.close();
//		
//		Multi-line scanner
//		while(true) {
//			String input = s.next();
//			System.out.println(input);
//			count++;
//			if(count == 2) {
//				break;
//			}
//		}
//		s.close();

		
		
		//Next do addition and basic math stuff
	
		int x = 0;
		x = x+5;
		x += 5;
		
		//MAKE ALLLLLL THE METHODS
		
		System.out.println(addition());
		System.out.println(subtract());
		System.out.println(multiply());
		System.out.println(divide());
		System.out.println(addition(2,2));
		
		
		//Integrate the scanner into parsing input for addition if time left
		
	}
	
	public static void printOut(String s) {
		
		System.out.println(s);
	}
	
	public static int addition() {
		
		int x = 5+5;
		
		return x;
	}
	
	public static int subtract() {
		int x = 6-5;
		return x;
	}
	
	public static int multiply() {
		int x = 5*5;
		return x;
	}
	public static int divide() {
		int x = 5/5;
		return x;
	}
	
	public static int addition(int a, int b) {
		
		return a+b;
	}
	
	//*****************************************
	//Make your own subtract, multiply, and divide methods
	
	
	//Use addition(int a, int b) in another function to help the function
	
	
	
	
	
}
