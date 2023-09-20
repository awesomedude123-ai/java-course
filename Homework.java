package com.sri.javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner oldScanner = new Scanner(System.in);
		String result = reverse("Hello World");
		System.out.println(result);
		
		int p=power(2,4);
		System.out.println(p);
		
		String r=reversed("1234");
		System.out.println(r);
		List<String> a =new ArrayList<String>();
		List<String> b =new ArrayList<String>();
		b.add("hi");b.add("bye");b.add("I am cool");
		a=reversedList(a,b);
		System.out.println(a);
		
	}//end main method
	
	//Binary Search Tree/Linked List
	public static String reverse(String x) {
		if(x.length()==1) {
			return x;
		}else{
			return x.substring(x.length()-1 , x.length()) + reverse(x.substring(0, x.length()-1));
		}
	}
	public static int power(int base,int exp){
		if(exp==0) {
			return 1;
		}else {
			exp--;
			return base * power(base,exp);
		}
	}
	public static String reversed(String y) {
		if(y.length()==1) {
			return y;
		}else {
			return y.substring(y.length()-1,y.length())+reversed(y.substring(0,y.length()-1));
		}
	}
	
	public static List<String> reversedList(List<String> b,List<String> a){
		if(a.size()==1) {
			b.add(a.get(0));
			return b;
		}else{
			b.add(a.get(a.size()-1));a.remove((a.size()-1));
			return reversedList(b,a);
		}
	}
}//end public class 
