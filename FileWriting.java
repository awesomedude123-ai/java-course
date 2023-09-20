package com.sri.javaProject;

import java.io.*;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 * These just write a file and read it
		 */
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("/Users/awesomedude123/Desktop/Programming/test/sri.txt")
					);
			bw.write("Sri is cool. I have not done this in a while. Let us see how cool it is\n");
			bw.write("Wow I never knew this would happen");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return;
		}//end try/catch statements
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("/Users/awesomedude123/Desktop/Programming/test/sri.txt")
					);
			
			String s;
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return;
		}//end try catch statement
		
		/**
		 * This will copy the file to another file
		 */
		
		BufferedWriter bw1 = new BufferedWriter(
				new FileWriter("/Users/awesomedude123/Desktop/Programming/test/sri-copy.txt"));
		
		File file;
		BufferedReader br1 = new BufferedReader(new FileReader("/Users/awesomedude123/Desktop/Programming/test/sri.txt"));
		String x;
		while((x=br1.readLine())!=null) {
			bw1.write(x);
		}//end while loop
		br1.close();
		bw1.close();
	}

}
