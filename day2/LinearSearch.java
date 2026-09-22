package day2;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //linear search 
		
		int [] num = {30,50,60,10,40};
		
		int search = 60;
		
		boolean found = false;
		
		for (int i =0; i< num.length; i++) {
			if(num[i] == search) {
				System.out.println("Value found at the index : " + i);
				found = true;
			break;
			}	
			}
			if (found == false) {
				System.out.println("Value not found ");
		}	
		
	}

}
