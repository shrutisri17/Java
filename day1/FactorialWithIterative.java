package day1;

import java.util.Scanner;

public class FactorialWithIterative {
	//Write the program to find factorial(iterative and recursion technique)
			//loop method is iterative 
	
	public static int factorial(int n) {
	
	int fact = 1;
	for(int i = 1;i<=n ; i++) {
		fact = fact *i;
		
	}
	
	return fact;
	}

	public static void main(String[] args) {
		
    
		
		Scanner scr = new Scanner(System.in);
		System.out.println("value of n =");
		int n = scr.nextInt();
		int result = factorial(n);
		

		
	
		System.out.println("Factorial Value of f! =" + result);
		
		
		
		
	}	
		

	}


