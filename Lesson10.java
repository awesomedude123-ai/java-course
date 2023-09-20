package com.sri.javaProject;

import java.util.ArrayList;

public class Lesson10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//String ?? Not-> Object -> Functionality, Aspects, Properties -> Symbol or image or whatever it is representing
		String str = "Hi! Today is a beautiful day, but I am is is is is tired!";

		
		
		//str.charAt(x); -> Character
		
		//str.compareTo(str); -> boolean
		
		//Case Senstive-The right case as well
		
		
		//Concatinate: Add stuff
		
		
		
		str.length(); //How long the string is - int
		
		str.equals(str);//checks to see if str is equal to str -boolean
		
		str.split(" ");	//splitting the string - Array
		
		str.contains("Hi");//checks to see if it contains the string - boolean
		
		str.substring(0, 3);//part of a string inside of a string - String
		
		str.charAt(1);//gets the character at the index -  char
		
		str.compareTo(str);//compares string to string - int/String
		
		str.compareToIgnoreCase("Hi! todAy is a bEutiful day, but I Am tired!");//compares string to string but ignores case - int/String
		
		str.concat("Hi this is the second argument");//Combines str to argument(str)-String
		
		str.equalsIgnoreCase(str);//checks to see if str is equal to str and ignores the case of string-boolean
		
		str.toUpperCase();//Makes everything uppercase - String

		str.toLowerCase();//Makes everything lowercase - String
		
		str.replaceAll("i", "hueb");//replace str with another string. Replaces i with hueb in all instances - String
		
		str.replaceFirst("Hi", "Replaced");//Replaces str with another string. Replaces hi with replaced only in the first occurrence - String
		
		
		
		/**
		 * Homework-Utilize the string methods today. Concat, length, replaceAll, eqaulsIgnoreCase...
		 * 
		 * 1. Input string
		 * Print length, check if it contains, make uppercase lowercase,
		 * 2. the first word uppercase - substring and uppercase
		 * 3. try out one method in string that we did not learn
		 * 4. Make own code utilize methods as well as what we learned(control statements, arrays, arraylists)
		 */
		
		//List of methods
		
		
		
	}
	
	/**
	 * 1. Use scanner and get the operation user wants.
	 * 2. Have a while loop to loop through operation number of times user wants
	 * 2. Use scanner and get the numbers the user wants.
	 * 4. Conduct operation and ask user whether he wants to keep going or not
	 * 5. If user wants to keep going, keep value the same in while loop else change the value and end the while loop
	 * 6. Print the answer
	 */

}
