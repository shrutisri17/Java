package day3;

import java.util.Scanner;

public class ScannerClassOperations {

	public static void main(String[] args) {
		//Write a single Java program to perform the following.
		//Prompt the user which operation they want to use and then take required inputs and perform the
		//action
		
		Scanner scn = new Scanner(System.in);
		
		//operations
		System.out.println("Choose an Operations");
		System.out.println("1.Subtraction");
		System.out.println("2.Addition");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		//Choose an operation
		
		System.out.println("Enter your Choice");
		int choice = scn.nextInt();
		
		
		
		System.out.println("Enter first number : ");
		int a = scn.nextInt();
		
		System.out.println("Enter second number : ");
		int b = scn.nextInt();
		
		switch(choice) {
		case  1:
		
		System.out.println("Result : " + (a+b));
		break;
		
		case 2:
		System.out.println("Result : " + (a-b));
		break;
		case 3:
		System.out.println("Result : " + (a*b));
		break;
		case 4:
		System.out.println("Result : " + (a/b));
		break;
		default:
		System.out.println("Invalid Choice :");
		break;
		
		
		
		}

		
		
		
	}

}
