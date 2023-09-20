package com.sri.javaProject;

import java.util.*;

class Practice1{
	static int id;
	String name;
	double payment;
	public Practice1(String name, double payment) {
		this.name=name;
		this.payment=payment;
	}//end constructor
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment=payment;
	}
	public String toString() {
		System.out.printf("%d I am %s the greatest %s of all time",9,"love","pick");
		StringBuilder sb = new StringBuilder();
		sb.append("Hello").append("World").append("I am the greatest");
		return sb.toString();
	}
	
}//end Practice1 class

public class Practice {
	
	public static void main(String[] args) {
		Scanner oldScanner = new Scanner(System.in);
		Random r = new Random();
		Practice1 p =new Practice1("Sri Mukkamala",10.50);
		Practice1 p1 =new Practice1("Srikar Mukkamala",11.50);
		Practice1.id=15;
		
		p.name="Srikar";
		System.out.println(p.id + " " + p1.id);
		p.id=200;
		System.out.println(p.id + " " + p1.id);
		p1.id=900;
		System.out.println(p.id + " " + p1.id);
		System.out.println(p.toString());
		
		
		
		/**System.out.println("Print a number");
		int one = oldScanner.nextInt();
		System.out.println("Print another number");
		int two = oldScanner.nextInt();
		
		int random1 = r.nextInt(one);
		int random2= r.nextInt(two);
		System.out.println("Sum: " + (random1 + random2));
		System.out.println("Difference: " + (random1 - random2));
		System.out.println("Multiplication: " + (random1 * random2));
		System.out.println("Quotient: " + (random1 / random2));
		System.out.println("Remainder: " + (random1 % random2));**/
		
		
		
	}//end main method

}//end public class
