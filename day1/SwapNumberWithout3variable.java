package day1;

import java.util.Scanner;

public class SwapNumberWithout3variable {
	public static void main(String[] args) {
	
	
	//swap 2 no without third variable
	 
	 
     Scanner scr= new Scanner(System.in);
     System.out.println("value of num1 =");
     int num1 = scr.nextInt();
     System.out.println("value of num2 =");
     int num2 = scr.nextInt();
	 System.out.println("Before Swap Value of num1 = " + num1);
	 System.out.println("Before Swap Value of num2 = " + num2);
	 
	 num1 = num1+num2; //70
	 num2 = num1-num2; //70-40
	 num1 = num1-num2;
		
	 System.out.println("After Swap Value of num1 = " + num1);
	 System.out.println("After Swap Value of num2 = " + num2);


}
}