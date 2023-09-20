package com.sri.javaProject;

import java.util.Scanner;

public class Lesson7 {

	public static void main(String[] args) {
		int x=10;
		
		main1();

	}//end main method
	/**
	 * Question 1: 
	 * for(int i=0; i<=100;i++) {
				System.out.print(i + " ");
			}//endfor loop

	 * Question 2: 
	 * for(int i = 1; i <= 10; i++) {
		 System.out.println(i * 9);
	   }
	   
	   Question 3:
	   Scanner oldScanner = new Scanner(System.in);
		System.out.println("Print a height(in terms of inches):");
		double height = oldScanner.nextDouble();
		if(height>36) {
			System.out.println("You are eligible to ride.");
		}else {
			System.out.println("You are not eligible to ride.");
		}

	 * Question 4:
	 * for(int i = 1; i <= 10; i++) {
		 for(int j = 1; j <= 10; j++) {
			 System.out.println(j * i);
		 }
	   }
	 */
	//public-visible to everyone
	//private-visible to no one
	//protected-visible to some , but is protected
	
	/**
	 * Return Type-Data type
	 * 
	 * void-im not returning anything: NONE
	 * int
	 * boolean
	 * double
	 * float
	 * String
	 * char
	 * 
	 */
	
	
	public static int main2(int x,String name, double y) {
		x = x* x;
		return x;
	}//end main2

	
	public static void main1() {
		System.out.println("Hey this worked");
	}//end main1 method


}
