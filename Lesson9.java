package com.sri.javaProject;

import java.util.*;

public class Lesson9 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		//objective1();
		//objective2();
		//objective3();
		//objective4();
	}

	static void objective1() {
		String word = scanner.nextLine();
		System.out.println(word.toUpperCase());
	}

	static void objective2() {
		String word = scanner.nextLine();
		String[] noSpaces = word.split(" ");
		String newWord = "";
		
		for(int i = 0; i < noSpaces.length; i++) {
			newWord = newWord + noSpaces[i];
		}

		System.out.println(newWord);
	}

	static void objective3(){
		String word1 = scanner.nextLine();
		String word2 = scanner.nextLine();

		if(word1.length() > word2.length()) {
			System.out.println(word1);
		} else if(word1.length() == word2.length()) {
			System.out.println("same length");
		} else {
			System.out.println(word2);
		}
	}

	static void objective4() {
		String word = scanner.nextLine();

		//You have to use the // because '.' means something else for the split method. Using the // will tell java that you want to split using the character itself and not the other meaning.
		String[] tokens = word.split("\\.");

		for(int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
