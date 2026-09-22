package day1;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner (System.in);
		System.out.println("Enter First Value ");
		int a = scr.nextInt();
		System.out.println("Enter Second Value");
		int b = scr.nextInt();
		System.out.println("Enter Third Value");
		int c = scr.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println(a + " is greaterest number");
		}
       if(b>a && b>c) {
    	   System.out.println( b + " is greaterest number");
       }
       
       if(c>a && c>b) {
    	   System.out.println(c + " is greaterest number"); 
    	   
       }
	}
	
	

}
