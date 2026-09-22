package day3;

public class StringtoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		//String to char Array
		String str = "Hello";
		
		System.out.println("String is : "+ str);
		
		char[] c = str.toCharArray();
		//array indexing
		for(int i = 0; i< c.length; i++) {
			
			System.out.println("Char Array is : "+ c [i]);	
		}
		
		
	}

}
