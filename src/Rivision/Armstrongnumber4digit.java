package Rivision;

public class Armstrongnumber4digit {
	public static void main(String[] args) {
		
	   int n=8208;
	   int arm=0,c,rem;
	   c=n;
	   while(n>0) {
		   rem=n%10;
		   arm=(rem*rem*rem*rem)+arm;
		   	n=n/10;
	   }if(c==arm) {
		   System.out.println("This is armstrong Number");
	   }else {
		   System.out.println("This is not armstrong Number");
	   }
			
	}

}
