package com.sri.javaProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Lesson13 {

	public static void main(String[] args) {

		//objective1();

	}

	public static void objective1() {
		String path = "(Your path here)";

		Scanner scanner = new Scanner(System.in);

		String fileName = "";

		System.out.print("Enter a filename: ");
		fileName = scanner.nextLine();

		String endToken = "end";
		String userInput = "";

		ArrayList<String> words = new ArrayList<>();

		while(!userInput.equals(endToken)) {
			words.add(userInput);
			userInput = scanner.nextLine();
		}

		words.remove(0);

		String finalOutput = "";

		for(String word : words) {
			finalOutput += word;
		}

		try {
			Files.write(Paths.get(path + "/" + fileName), finalOutput.getBytes(), StandardOpenOption.CREATE);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}

class Animal {
	private int legs;
	private String scientificName;

	public Animal(int legs, String scientificName) {
		this.legs = legs;
		this.scientificName = scientificName;
	}

	public String toString() {
		return "[" + legs + " " + scientificName + "]";
	}

}