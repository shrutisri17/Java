package day1;

import java.util.Scanner;

public class Swap2NumberWithVariable {

	public static void main(String[] args) {
		
		
		//swap 2 no with third variable
		Scanner scr = new Scanner (System.in);
		System.out.println("value of a = " );
		int a = scr.nextInt();
		System.out.println("value of b =");
		int b = scr.nextInt();
		
		
		System.out.println("Before Swap Value of a = " + a);
		System.out.println("Before Swap Value of b = " + b);
		
		int temp = a;
		 a = b;
		 b = temp;
		 System.out.println("After Swap Value of a = " + a);
		 System.out.println("After Swap Value of b = " + b);
		
		
	}

}
