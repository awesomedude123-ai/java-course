package com.sri.javaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner oldScanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int i=oldScanner.nextInt(),c=1;
		ArrayList<Integer> a=new ArrayList<Integer>();a.add(1);a.add(1);
		for(int y=0;y<i;y++) {
			if(y<2) {
				System.out.print(a.get(y)+" ");
			}else {
				int x=a.get(y-2)+a.get(y-1);
				a.add(x);
				System.out.print(x+" ");
			}
		}
		/**
		 * for(int y=1;y<=i;y++) {
			c*=y;
		}
		System.out.println("Factorial of "+i+": "+c);

		 */
	}

}
