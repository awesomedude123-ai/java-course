package com.sri.javaProject;

public class Lesson6 {

	public static void main(String[] args) {

		//method1();
		//System.out.println(method2());
		//Question 3:
		//	No, you cannot overload a method by using a different return type. This is because when you call a method, only the method name and parameters are known.
		// 	If you have identical methods with different return types, then Java doesn't know which method you want to call. Here's an example: Let's say you have two methods, both of which are called 'add' and take two integers as parameters.
		//  Here are the method signatures. (public static int add(int a, int b);) and (public static String add(int a, int b);). Let's say that the one that returns an int returns the sum of 'a' and 'b' and that the other one returns "Hello!".
		// 	Using that information, tell me what gets printed down below.
		//  System.out.println(add(5, 6));
		//  It's impossible to tell which add method should get called here, so you can't determine the output. Not even java can determine which method you want to call! Because of that, java won't let you overload using the return type.

	}//end main method

	public static void method1() {
		printString("This is a string!");
	}

	private static void printString(String string) {
		System.out.println(string);
	}
	
	public static int method2() {
		int x = 10;
		return x+x;
	}//end method2
	
	

}//end public class
