package day3;

public class IgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello To Programming World";
		String str2 = "HELLO TO PROGRAMMING WORLD";
		System.out.println(str1);
		System.out.println(str2);
		//
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("World are same");
		}else {
			System.out.println("World are not same");
		}

	}

}
