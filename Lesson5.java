package com.sri.javaProject;

import java.util.*;

public class Lesson5 {

	public static void main(String[] args) {
		
		//2 Input
		//Call method(pass these two numbers as arguments)
		//In the method your going to print um, difference, product, quotietn, and remainder
		
		Random r = new Random();
		Scanner oldScanner = new Scanner(System.in);
		
		int range = r.nextInt(11) + 5;
		
		System.out.println(range);
		
		
		int x1 =(int) (Math.random()*100);
		
		System.out.println(x1);
		
		int x = r.nextInt(10);
		System.out.println(x);
		
		double name1 = (double) x;
		
		System.out.println(name1);
		
		
	
		
		// 9870.3 - > 9.8703 * 10^3
		
		
		
		//Question 1

	/**\
	 * 	System.out.println("Enter your name: ");
	 * String name = oldScanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = oldScanner.nextInt();

		System.out.println("Hello " + name + ", you are " + age + " years old.");

		//End of Question1

		System.out.println("Enter a number.");
		int x = oldScanner.nextInt();
		System.out.println("Enter a second number.");
		int y = oldScanner.nextInt();
		System.out.println(x+y);

		oldScanner.close();

	 */
	
		
		/**
		 * System.out.println("Do we need help?");
		String answer = oldScanner.nextLine();
		System.out.println(answer);
		System.out.println("Forgive me, could you please repeat what you said?");
		String answer1 = oldScanner.nextLine();
		System.out.println(answer1);
		 */
		
		
		/**
		 * String
		 * char
		 * int
		 * boolean
		 * float
		 * double
		 */
	
		
		/*8
		 * System.out.println("Hey how are you?");
		String answer = oldScanner.nextLine();
		System.out.println(answer);
		System.out.println("I am doing great. What beautiful weather we have today.");
		answer = oldScanner.nextLine();
		System.out.println(answer);
		System.out.println("So did you find all the things you are looking for?");
		answer = oldScanner.nextLine();
		System.out.println(answer);
		oldScanner.close();
		
		
		
		
		 */
		
		System.out.println("WHat is your lucky number?");
		
		String value1 = oldScanner.nextLine();
		
		int number = oldScanner.nextInt();
		
		double number1 = oldScanner.nextDouble();
		
		float number2 = oldScanner.nextFloat();
		
		boolean value = oldScanner.nextBoolean();
		
		char c = oldScanner.nextLine().charAt(0);
		
		System.out.println(number);
		
		oldScanner.close();
		
		
		//Dice program: Print a rondom number between 1-6
		//Input two numbers. Use those number as a range for your random class. print the sum, the difference, the product, the quotient, and the remainder. ******Use integer and double****
		
		
		int a = oldScanner.nextInt();
		int b = oldScanner.nextInt();

	}//end method
}//end public class
