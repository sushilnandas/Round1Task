package com;

import java.util.Scanner;

public class Problem1 {

	double add = addition(123,4565);
	double sub = subraction(123,456);
	double div = division(213,234);
	double mul = multiplication(234,432);
	
	
	
	
	public static double addition(double a, double b) {
		
	
		return a+b;
	}
		
	
	public static double subraction(double a, double b) {
		
		if(a>b) {
		
		return a-b;
		}
		return b-a;
	}
	
	public static double division (double a, double b) {
		
		return a/b;
		
		
	}
	
	public static double multiplication (double a, double b) {
		return a*b;
		
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first value:");
		double a = sc.nextDouble();
		System.out.println("enter your second value:");
		double b = sc.nextDouble();
		System.out.println();
		System.out.println("Enter your  type of operation");
		System.out.println("1.Addition");
		System.out.println("2.Subraction");
		System.out.println("3.Divsion");
		System.out.println("4.Multiplication");
		int choice = sc.nextInt();
		if(choice>4) {
			System.out.println("invalid input");
		}
		switch(choice) {
		
		case 1:
			double add =addition(a,b);
			System.out.println("Addiiton of two values are"+" "+add);
			break;
		
		case 2:
			double sub =subraction(a,b);
			System.out.println("Subraction of two values are"+" "+sub);
			break;
			

		case 3:
			double div =division(a,b);
			System.out.println("Division of two values are"+" "+div);
			break;
			

		case 4:
			double mul = multiplication(a,b);
			System.out.println("Subraction of two values are"+" "+mul);
			break;
		    
		}
		
		
	}
	
}
