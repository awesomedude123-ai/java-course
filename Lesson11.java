package com.sri.javaProject;

public class Lesson11 {

	//Objective 1
	static class Book {
		private int numOfPages;
		private String title;
		private String author;

		public Book(String title, String author, int numOfPages) {
			this.title = title;
			this.author = author;
			this.numOfPages = numOfPages;
		}

		//Objective 2
		public static boolean equals(Book book1, Book book2) {
			return book1.numOfPages == book2.numOfPages && 
				   book1.title.equals(book2.title) && 
				   book1.author.equals(book2.author);
		}

		//OR

		public boolean equals(Book other) {
			return numOfPages == other.numOfPages && 
				   title.equals(other.title) && 
				   author.equals(other.title);
		}

		//End of Objective 2
	}

	//Objective3
	static class Calculator {
		public static double add(double a, double b) {
			return a + b;
		}

		public static double subtract(double a, double b) {
			return a - b;
		}

		public static double multiply(double a, double b) {
			return a * b;
		}

		public static double divide(double a, double b) {
			return a / b;
		}

		public static double average(double... numbers) {
			double sum = 0;

			for(double i : numbers) {
				sum += i;
			}

			return sum / numbers.length;
		}
	}

	//OR

	public double calculate(double a, double b, String op) {
		switch(op) {
			case "+":
				return a + b;
			case "-":
				return a - b;
			case "*":
			case "x":
				return a * b;
			case "/":
			case "÷":
				return a / b;
			default:
				System.out.println(op + " is not a valid operation!");
				return -1;
		}
	}

	//End of Objective 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
