package com.sri.javaProject;

public class Lesson8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//control statements
		
		int x = 11;
		
		//if statement
		
		//If something happens, then this should occur. Else statenent
		
		/**
		 * ==-Checks if value is equal to
		 * <-Less than
		 * >-greater than
		 * <=-less than or equal to 
		 * >=-greater than or equal to
		 * && - and
		 * || - or
		 */
		
		
		//If else statement
		if(x<10) {
			System.out.println("x is less than 10");
		}else if(x==10){
			System.out.println("x is equal to 10");
		}else {
			System.out.println("x is greater than 10");
		}
		
		
		//while
		
		int y = 10;
		while(y>=0) {
			System.out.println(y);
			y--; //y=y-1
		}
		

	}
	
	/**
	 * Question 1:
	 * String[] array = {"Sri", "Pranav", "Ajay", "Josh"};
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		Question 2:
		int[] array = {2,23,45,67,87,54,23,4,32,8};
		int num=0;
		for(int i=0;i<array.length;i++) {
			if(num<array[i]) {
				num = array[i];
			}
		}//end for loop
		System.out.println(num);
	 */

}
