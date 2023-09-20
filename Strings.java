package com.sri.javaProject;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 //ASCII Standard Encoding -> Translates each and every character(letters, numbers, symbols)-> a value
		
		//Form of security measures
		
		//Each character is given a value that is set
		
		//rather checking visually, the message digesting. Take file-> number
		//Unicode Encoding
		
		String a = "anish";//->10000
		
		System.out.println(a.hashCode());
		
		a="Anish";
		
		System.out.println(a.hashCode());
		
		
		
		/**
		 * Utilize String methods we learned
		 * 
		 * Try out a new string method
		 */
		//METHODS
		a = a.concat(" and Sri are best friends"); // Combines Strings
		System.out.println(a);
		
		
		/**
		 * if s1 > s2, it returns positive number  unicode
			if s1 < s2, it returns negative number  
			if s1 == s2, it returns 0
		 */
		
		System.out.println(a.compareTo("anish"));//Compares based on the Unicode
		a.equals(a); // 
		
		a.compareToIgnoreCase(a);
		a.equalsIgnoreCase(a);
		
		
	}//end main methods

}//end Strings class
