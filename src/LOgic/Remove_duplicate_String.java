package LOgic;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_duplicate_String {

	public static void main(String[] args) {

	String []sk= {"saurabh","Sanket","sunny","saurabh"};
	
	System.out.println(sk);
	LinkedHashSet<String>s=new LinkedHashSet<>() ;
	for(int i=0;i<sk.length;i++) {
	 s.add(sk[i]);
	}
	for(String d:s) {
		System.out.print(d+" ");
	}
   
	
	}

}
