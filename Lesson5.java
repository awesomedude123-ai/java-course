package com.sri.javaProject;

import java.util.Scanner;

public class Lesson5 {

	public static void main(String[] args) {
		
		Scanner oldScanner = new Scanner(System.in);

		//Question 1

		System.out.println("Enter your name: ");
		String name = oldScanner.nextLine();
		
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

	}

}
