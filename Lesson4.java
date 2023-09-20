package com.sri.javaProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		
		//Objective 1
		int one = 10;
		int two = 90;
		System.out.println(one + "\n" + two);
		
		//Objective 2
		System.out.println("Sum: " + (one + two));
		System.out.println("Difference " + (two - one));
		System.out.println("Product " + (one * two));
		System.out.println("Quotient " + (two/one));
		System.out.println("Remainder " + (two % one));
		
		
		System.out.println("This is me " + "zthis is me");
		
		int x = 0;
		mainLoop: while(true) {
			System.out.println("This is cool");
			x++;
			if(x==10) {
				break mainLoop;
			}
		}
		
		Scanner oldScanner = new Scanner(System.in);
		
		int age = 0;
		try{
			System.out.println("Enter a number: ");
			if(oldScanner.hasNextInt()) {
				age = oldScanner.nextInt();
			}else {
				System.out.println("Enter a number: ");
				if(oldScanner.hasNextInt()) {
					age = oldScanner.nextInt();
				}
			}
			
			
		}catch(InputMismatchException ime) {
			System.out.println("Enter a number: ");
			if(oldScanner.hasNextInt()) {
				age = oldScanner.nextInt();
			}
		}
		
		System.out.println(age);
		
	boolean value =	x==0 ? true : false;
		
	}//end main method

}//end public class

/*
 * Question 1: 
 * int myFavoriteNumber = 0;
   System.out.println(myFavoriteNumber);
   
 * Question 2: Pascal case is used to name classes and projects while Camel case is used to name variables. In Pascal case, the first letter of every word is capital while in Camel
 * case, the first letter of every word is capital except the first word. 
 */
