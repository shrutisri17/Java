package day2;

public class BubbleSort {

	public static void main(String[] args) {
	 
		
		//bubble sorting is sort the value ascending order
		
		int [] arr = {50,30,20,70,65};
		
		//outer loop 
		for (int i = 0; i< arr.length - 1; i++) {
		//inner loop
			
			for (int j = 0; j<arr.length - 1 - i; j++ ) {
				if(arr[j] > arr[j+1]) {
					
				
				int temp = arr[j];
				//move smaller number to left
				
				arr[j] = arr[j+1];
				arr[j+1]= temp;
				
			}
		}

			
	}
		System.out.println("Sorted Array : ");
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.println(arr[i]);
		}
}
}