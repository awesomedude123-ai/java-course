package com.sri.javaProject;

import java.io.*;
import java.util.Scanner;

public class FileWriting1 {
	
	public static void main(String[] args) throws IOException {
		
		//BuffereedWriter -> Writes to your files
		//BufferedReadaer -> Reads to your files
		
		///Users/awesomedude123/Desktop/Programming
		
		//h/h/h/h
		
		//Test each ride!!! With every ride created, there is always test
		/**
		 * Scanner oldScanner = new Scanner(System.in);
		try {
			
			int x=oldScanner.nextInt();
		}catch(Exception e) {
			oldScanner.nextLine();
			try {
				int y=oldScanner.nextInt();
			}catch (Exception p){
				System.out.println("go away you darn fool");
			}
		}
		 */
		
		
			/**
			 * t
			 */
			
		//BW- Create a new file in the location if its not present. If it present, it clears the file and rewrites everything. 
		
		try {
			BufferedWriter bw = new BufferedWriter(
				new FileWriter("/Users/awesomedude123/Desktop/Programming/test/sri2.txt")
				);
			bw.write("Hi! This is Sri!\n");
			bw.write("This is Sri!");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		try {
		BufferedReader bw1 = new BufferedReader(
				new FileReader("/Users/awesomedude123/Desktop/Programming/test/sri2.txt"));
		Writer out;
		BufferedWriter bw2 = new BufferedWriter(
				new FileWriter("/Users/awesomedude123/Desktop/Programming/test/sri2-copy.txt"));
		String sentence;
		while(( sentence = bw1.readLine())!=null) {
			bw2.write(sentence);
		}//end while
		bw2.close();
		}catch (Exception e) {
			System.out.println(e);
		}//end try/catch statement
		
		
		
	}//end main method

}//EndFileWriting1 
