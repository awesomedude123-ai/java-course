package com.sri.javaProject;

public class Lesson14X implements Lesson14I{
	
	

	@Override
	public int number(int num) {
		int i = 1;
		for(int x =1; x<=10;x++) {
			i=i*num;
		}//end for loop
		
		return i;
	}//end number method

	@Override
	public void name(String nam) {
		System.out.println("Hello there. My name is " + nam);
	}//end name method

	
}//end class
