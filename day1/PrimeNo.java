package day1;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scr =new Scanner (System.in);
       System.out.println("Value of a = " );
       int a = scr.nextInt();
		
       //for loop
       
       boolean isprime = true;
       if (a<=1) {
    	   isprime = false;
       }
       else {
       
       for(int i = 2; i<a; i++) {
    	   if(a%i ==0) {
    	  isprime = false;
    		   break;
    	   }
       }
       }
		if (isprime) {
			System.out.println("Given number is Prime " + a);
		}
		
		else {
			System.out.println("Given number not Prime " + a);	
		}
		System.out.println("End of the program");
	}

}
