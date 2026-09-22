   package day1;

  import java.util.Scanner;

   public class ReverseDigitAndString {
	
	// Function to reverse a number
	public static int reverseNumber(int num) {
		int reverse = 0;
		for(; num!= 0; num = num/10) {
			int digit = num%10;
			reverse = reverse * 10 + digit;
		}
		return reverse;
	}
		
		// Function to reverse string
		public static String reverseString(String str) {
			
			String reverse =" ";
			for(int i = str.length()- 1; i>=0; i--  ) {
				
				reverse = reverse + str.charAt(i);
			}
			return reverse;
			
				
			}
			
		public static void main(String[] agrs) {
			Scanner scr = new Scanner(System.in);
			System.out.println("you want to reverse a string or digit");
			System.out.println("1. Digit");
			System.out.println("2. String");
			int choice = scr.nextInt();
			if(choice ==1) {
				System.out.println("Enter the number");
				int num = scr.nextInt();
				int result = reverseNumber(num);
			
				System.out.println("Reverse of the number is " + result);
				
				
			
		}
			else if (choice ==2) {
				System.out.println("Enter the string");
				String str = scr.next();
				String result1 = reverseString(str);
				System.out.println("Reverse of the string is " + result1);
			}
		
		
		else {
			System.out.println("Choice is invalid");
			
		}
	
		
   }
   }
	
	


