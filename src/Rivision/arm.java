package Rivision;

public class arm {

	public static void main(String[] args) {
		int n=151,arm=0,rem,c;
		c=n;
	while(n>0) {
		rem=n%10;
		
		arm=(rem*rem*rem)+arm;
		n=n/10;
		
	}if(c==arm) {
		System.out.println("This is arm strong");
	}else {
		System.out.println("THis is not armstrong");
	}
		 
		
	}

}
