package com.sri.javaProject;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = num();
		System.out.println("8 and " + x);
		
		str(x);
		
		String str1 = "Hi this is sri";
		
		
		
		try {
			System.out.println(str1.charAt(str1.length()-1));
		}catch (Exception e){
			System.out.println("This should print if it does not work: " + e);
		}finally{
			System.out.println("This will run finally");
		}
		
		System.out.println("This is Me!!");
		
	}//end main method
	
	
	
	public static void hi() {
		System.out.println("hi");
	}//end hi ethod

}//end publc class
