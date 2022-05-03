package LOgic;
public class ReverseMiddleString{
	 
	static void printReverse(String str)
	    {
	        // Print first word
	        int i = 0;
	        for (i = 0; i < str.length() && str.charAt(i) != ' '; i++)
	            System.out.print(str.charAt(i)) ;
	 
	        String word = "";
	         
	        for (; i < str.length(); i++) {	
	     
	            if (str.charAt(i) != ' ')
	                word += str.charAt(i);
	                 
	            else {
	                    System.out.print(new StringBuilder(word).
	                                reverse().toString() + " ");
	                    word = "";
	            }
	        }
	     
	        System.out.print(word + " ");
	    }
	     
	    public static void main(String []args)
	    {
	        String str = "hello my name is Saurabh";
	        printReverse(str);
	    }
}
	