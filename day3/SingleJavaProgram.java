package day3;

import java.util.Scanner;

public class SingleJavaProgram {
	
	/*Write a single Java program to perform the following.
	 * Prompt the user which operation they want to use and then take required inputs and perform the action
	 * to remove given characters from the string
      to remove all the white spaces from a given string
      to capitalize the first letter of each word in a given string
      to find all the substrings of a given string.
      to check if a given text is a rotation of another text(example : "aana" is rotation of "naaa")
	 */
     
	//1.to remove given characters from the string
	public static String removeCharacters(String str, String c) {
    	 String result = " ";
    	 for(int i = 0; i<str.length(); i++) {
    		 char ch = str.charAt(i);
    		 if(c.indexOf(c) == -1) {
    			 result = result +c;
    		 }
    	 }
    	return result;
    	 
    	 
     }
	//2.to remove all the white spaces from a given string
	public static String removeWhiteSpaces(String str1) {
		
		String result = " ";
		for(int i =0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(ch!=' ') {
				result = result +ch;
				
			}
		}
		return result;
		
	}
	  
	
	// 3. Capitalize first letter of each word
	public static String capitalizeFirst(String str3) {
		String result =" ";
		boolean firstLetter = true;
		for(int i = 0; i< str3.length(); i++) {
			char c =str3.charAt(i);
			if(c == ' ') {
			result = result + c;
			
			firstLetter = true;
		}else if (firstLetter) {
		result = result + Character.toUpperCase(c);
		firstLetter = false;
	}else {
		result = result + c;
		
	}
	
		}
	return result;
		
	}
	//4.  to find all the substrings of a given string.
	
	public static void subStrings(String str4) {
		for(int i = 0; i<str4.length(); i++) {
			for(int j= i +1 ;j<=str4.length(); j++) {
				System.out.println(str4.substring(i,j));
				
			}
		}
		
	}
	
	// 5.Check if string is rotation of another string
	public static boolean checkRotation(String str5, String str6) {
		if(str5.length() != str6.length()) {
			return false;
			
		}
		String combined = str5 + str5 ;
		return combined.contains(str6);
	}
	
	
	
	
	
	public static void main(String[] args) {
    	 
    	 Scanner scr = new Scanner(System.in);
    	 
    	 
    	 
    	 System.out.println("Which operation want to perform");
    	 System.out.println("1.to remove given characters from the string");
    	 System.out.println("2.to remove all the white spaces from a given string");
    	 System.out.println("3.to capitalize the first letter of each word in a given string");
    	 System.out.println("4.to find all the substrings of a given string");
    	 System.out.println("5.to to check if a given text is a rotation of another text");
    	 
    	 int choice = scr.nextInt();
    	 scr.next();
    	 
    	 if(choice == 1) {
    		 System.out.println("Enter the String :");
    		 String str = scr.nextLine();
    		 
    		 System.out.println("Enter the character which needs to remove :");
    		 String c = scr.nextLine();
    		 
    		 
    	 }
    	 else if (choice == 2) {
    		 System.out.println("Enter the String :");
    		 String str1 = scr.nextLine();
    		 }
    	 else if (choice == 3) {
    		 System.out.println("Enter the String :");
    		 String str2 = scr.nextLine();
    	 }
    	 else if(choice == 4) {
    		 System.out.println("Enter the String :");
    		 String str3 = scr.nextLine();
    	 }
    	 
    	 else if(choice == 5) {
    		 System.out.println("Enter the String :");
    		 String str4 = scr.nextLine();
    	 }
    	 else {
    		 System.out.println("Given choice is invalid");
    	 }
 }
     
	
	
	
}
