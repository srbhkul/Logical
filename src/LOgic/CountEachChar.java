package LOgic;

public class CountEachChar {
	
	public static void main(String[] args) {
		
	String s="i love coding and testing";
	
   String a=s.replace(" ", "");
   
  for (int i=0;i<a.length();i++) {
	  char c=a.charAt(i);
	  
	  int q =0;
  for(int j=0;j<a.length();j++) {
	  char c2=a.charAt(j);
	  if(c==c2){
		  q=q+1;
	  }
	 
  } System.out.println(c+" -> "+q); 
  
 
		
		
  }	
	
	}

}
