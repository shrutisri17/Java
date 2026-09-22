package day1;

import java.util.Scanner;

public class FactorialWithRecursion {
	
	// Recursion is the process in which a method calls inside of itself
	
	public static int factorial(int n) {
		
		if (n == 1|| n ==0) {  //stopping condition
			return 1;
		
		}
		
		
		return n * factorial(n-1); //recursive line
	}

	
	
	
	    public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("value of n =");
		int n = scr.nextInt();
		int result = factorial(n);
		
		System.out.println("Factorial of n! = " + result);
		
		
		
		
			
		}
	}
		

	


