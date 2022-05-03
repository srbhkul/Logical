package Rivision;

public class findCharCountOfEachString {

	public static void main(String[] args) {
	       String s="My name Is Saurabh";
	         int count=0;	
		
		 for(int i = 0; i < s.length(); i++) {    
	            if(s.charAt(i) != ' ') 
	                count++;    
	        }    
		
		System.out.println("total number of String is "+count);
	}}
