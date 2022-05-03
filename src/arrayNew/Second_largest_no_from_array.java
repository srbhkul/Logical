package arrayNew;


import java.util.Arrays;

public class Second_largest_no_from_array {

	public static void main(String[] args) {
		
		int s []= {5,6,8,7,66,18,11,25} ;
		
	    Arrays.sort(s);
   System.out.println("Min no from array "+s[0]);
	    
	 System.out.println("largest no from array	 "+s[s.length-1]);
	   
	 System.out.println("second largest no "+s[s.length-2]);
	    
	    
		
	}

}
