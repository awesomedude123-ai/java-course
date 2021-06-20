package com.sri.javaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson12 {

	public static void main(String[] args) {
		
		ArrayList<Person> array = new ArrayList<Person>();
		array.add(new Student());
		
		Person student = new Student();
		Student person = ((Student) new Person());
	
	}//end main method
		
}//end class


class Student extends Person {
	
	public void speak() {
		talk("Hello!");
	}
	
	public void person() {
		System.out.println("My name is " + name + ". My age is " + age + ".");
	}
	
}

class Person {

	String name;
	int age;

	public void talk(String str) {
		System.out.println(str);
	}
	
}//end class Person
