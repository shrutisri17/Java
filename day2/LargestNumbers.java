package day2;

public class LargestNumbers {

	
		// TODO Auto-generated method stub
		//solve the following using function overloading
		//a. find largest of three numbers and largest of two numbers
		// for overloading method will same parameter will change.
	    
	   
	    //creating method
	    static int largestin3 (int a, int b, int c) {
			
			if(a>b && a>c) {
			return a;	
			}
			else if (b>c) {
				return b;
			}
			else {
				return c;
			}		
			
		}
	    
	 // largest of two numbers
	    static int largestin2(int i , int j) {
	    	if(i>j) {
	    		return i;
	    		}
	    	else {
	    		return j;
	    	}
	    }
	     
	    public static void main(String[] args) {
	    	
	    	
	  
	     //calling method 
		int s = largestin3(2000, 3000, 5000);
		int l = largestin2(700,500);
		System.out.println(s);
		System.out.println(l);

}
	    
}

 