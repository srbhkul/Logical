package LOgic;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter The Value");
		Scanner srbh = new Scanner(System.in);
           int n =srbh.nextInt();
		boolean sk=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				sk=true; 
			}
		}if(!sk) 
			System.out.println("Prime");
		else {
			System.out.println("Not prime");
		}
           
        
           
           
}
}
