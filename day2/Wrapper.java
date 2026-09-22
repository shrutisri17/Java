package day2;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use wrapper class methods do the following
		//a. convert string to int
		//b. convert int to Integer
		//c. convert Integer to float
		//d. convert int to string
		//e. find max of two numbers
		//f. find min of two float numbers
		
		
		
		//a. convert string to int
		String str = "200";
		//parseInt is for String to integer
		int n = Integer.parseInt(str);
		System.out.println(n);
		
		//b. convert int to Integer
		int a = 400;
		Integer i = Integer.valueOf(a);
		System.out.println(a);
		
		//c. convert Integer to float
		Integer num = 500;
		float f = num.floatValue();
		System.out.println(num);
		
		//d. convert int to string
		int num2 = 600;
		String s1 = Integer.toString(num2);
		System.out.println(s1);
		
		//e. find max of two numbers
		
		int a1 = 150;
		int a2 = 180;
		
		int max = Integer.max(a1, a2);
		System.out.println(max);
		
		//f. find min of two float numbers
		
		float b1 = 20.50f;
		float b2 = 30.96f;
		Float min = Float.min(b1, b2);
		System.out.println(min);
		
		
	}
	

}
