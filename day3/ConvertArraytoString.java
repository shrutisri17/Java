package day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConvertArraytoString {

	public static void main(String[] args) {
		
		//array to string
		
		int[] num = {20,30,60,50};
		
		for (int i = 0; i<num.length ; i++ ) {
			System.out.println("Array value is : " + num[i]);
		}
		
		
		String str = Arrays.toString(num);
		
		System.out.println("Array to String value is : " + str);
		


	}

}
