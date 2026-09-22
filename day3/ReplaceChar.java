package day3;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //to remove given characters from the string
		
		String str = "Hello World";
		char ch = 'l';
		
		String result = str.replace(String.valueOf(ch), "");
		
		System.out.println("Original Value of String :" + str);
		
		System.out.println("Result of String : " + result);
				
	}

}
