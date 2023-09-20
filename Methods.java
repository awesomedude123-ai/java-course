package com.sri.javaProject;

public class Methods {
	
	public static void main(String[] args) {
		
		double number = main1(11);
		System.out.println(main1(11));
		System.out.println(range());
		
		main1(11);
		
	}//end mein method
	
	
	//Make a method tha takes an input string and then prints out the string + "Any words"
	//Take hw, implement that through the methods
	
	/**
	 * 
	 *void-nothing
	 *int-int
	 *boolean-boolean
	 *char-char
	 *double-double
	 *float-float
	 *String-String
	 *
	 */
	
	public static double main1(int x) {
		return (double) x+10;
	}//end main1 method
	
	public int range() {
		System.out.println(10+10);
		return 10;
	}
	

}//end public class
