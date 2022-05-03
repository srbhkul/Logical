package LOgic;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
//		Scanner sk=new Scanner(System.in);
//		System.out.println("Type Your Name");
//		String s=sk.next();
//		System.out.println("Which Char Want to Count");
//		String r=sk.next();
//	    String f=s.replace(r, "");
//	    int a=s.length()-f.length();
//	  System.out.println("Count of Char "+r+" is");
//	  System.out.println(a);
	  
	  String d= "i love testing and coding";
	  int q=0;
	  for (int i=0;i<=d.length()-1;i++) {
		  if (d.charAt(i)=='t') {
			  q=q+1;
		  }
		  }
	 
	  System.out.println(q);
	  
	  
	  
	  
	}

}
