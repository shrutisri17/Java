package day1;

import java.util.Scanner;

public class FirstLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("First number a = ");
		int a = scr.nextInt();
		System.out.println("Second number b = ");
		int b = scr.nextInt();
		System.out.println("Third number c = ");
		int c = scr.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println("value of a = "+ a + "First greater number");
			
		}
       if(b>c) {
    	   System.out.println("value of b = "+ b + "Second greater number"); 
    	   System.out.println("value of c = "+ c + "Third greater number");
       }
       

    	   else if (b > a && b > c) {

               System.out.println("value of b = " + b + " First greater number");

               if (a > c) {
                   System.out.println("value of a = " + a + " Second greater number");
                   System.out.println("value of c = " + c + " Third greater number");
               } else {
                   System.out.println("value of c = " + c + " Second greater number");
                   System.out.println("value of a = " + a + " Third greater number");
               }

           }

           // If c is the largest
           else {

               System.out.println("value of c = " + c + " First greater number");

               if (a > b) {
                   System.out.println("value of a = " + a + " Second greater number");
                   System.out.println("value of b = " + b + " Third greater number");
               } else {
                   System.out.println("value of b = " + b + " Second greater number");
                   System.out.println("value of a = " + a + " Third greater number");
               }
           }
    	   
       }
    	   
	}


