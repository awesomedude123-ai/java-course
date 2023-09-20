package com.sri.javaProject;

import java.util.*;


public class Lesson9 {

	static Scanner oldScanner = new Scanner(System.in);

	public static void main(String[] args) {
		//objective1();
		//objective2();
		//objective3();
		//objective4();
		
		ArrayList<String> namesInClass = new ArrayList<String>();
		
		System.out.println();
		
		namesInClass.add("Sri");
		namesInClass.add("Srikar");
		namesInClass.add("Anish");
		namesInClass.add("Sid");
		System.out.println(namesInClass);
		/**
		 * 		String[] name = new String[9];
		
				System.out.println(name.length);
		 */
		
		int num = 0;
		int num1 = 1;
		System.out.println("Provide a number: ");
		int answer = oldScanner.nextInt();
		for(int i = 0; i<answer;  i++) {
			int num2 = num + num1;
			if(answer>=num2) {
				if(answer == num2) {
					System.out.println(answer + " is in the Fibonnaci Sequence");
					break;
				}else {
					num=num1;
					num1=num2;
				}//end if else statement
			}else {
				System.out.println(answer + " is not in the Fibonnaci Sequence");
				break;
			}
			
		}
		
		
	
	/**
	 * [null,Srikar,null,null,null,null,null]
	 * 0,1,2,3,4,5
	 */
	
	ArrayList<Character> name1 = new ArrayList<Character>();
	name1.add('S');
	name1.add('A');
	name1.add('P');

	System.out.println(name1);
	
	/**
	 * add-adds a new element to the next index
	 * remove-removes the element form the specified index
	 * set-changes the value in specified index
	 * get-provides value in specified index
	 * size-gets you the length
	 * conatins - Method checks if a character is in name1
	 */
	System.out.println(name1.get(0));
	System.out.println(name1.get(2));
	
	name1.remove(2);
	System.out.println(name1);
	
	name1.size();
	System.out.println(name1.size());
	
	name1.contains('S');
	System.out.println(name1.contains('P'));
		
	}//end main method

	static void objective1() {
		String word = oldScanner.nextLine();
		System.out.println(word.toUpperCase());
	}

	static void objective2() {
		String word = oldScanner.nextLine();
		String[] noSpaces = word.split(" ");
		String newWord = "";
		
		for(int i = 0; i < noSpaces.length; i++) {
			newWord = newWord + noSpaces[i];
		}

		System.out.println(newWord);
	}

	static void objective3(){
		String word1 = oldScanner.nextLine();
		String word2 = oldScanner.nextLine();

		if(word1.length() > word2.length()) {
			System.out.println(word1);
		} else if(word1.length() == word2.length()) {
			System.out.println("same length");
		} else {
			System.out.println(word2);
		}
	}

	static void objective4() {
		String word = oldScanner.nextLine();

		//You have to use the // because '.' means something else for the split method. Using the // will tell java that you want to split using the character itself and not the other meaning.
		String[] tokens = word.split("\\.");

		for(int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}//end public class
