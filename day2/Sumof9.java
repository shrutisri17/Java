package day2;

public class Sumof9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program which inputs a positive natural number N and prints the possible consecutive number
		//combinations, which when added give N.
		//input:9
		//OUTPUT:
		//4 5
		//2 3 4
		
		int n = 9;
		
		for(int i =1; i< n; i++) {
			
			int sum= 0;
			//
		for(int j =i ;j< n; j++) {
			 sum = sum +j;
			 
		if (sum == n) {
		for (int k =i; k<=j ; k++) {
			System.out.print(k + " ");	
		}
		
		System.out.println();	
		break;
		}
			
		
		
		if(sum>n) {
			break;
		}

		}

	}
}
}