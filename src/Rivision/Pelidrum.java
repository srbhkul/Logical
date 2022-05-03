package Rivision;

public class Pelidrum {

	public static void main(String[] args) {
		int n= 151;
		int pel=0,rem,c;
		c=n;
          while (n>0) {
        	  rem= n%10;
        	  
        	  pel=rem+pel*10;
        	  
        	  n=n/10;
          }if(c==pel) {
        	  System.out.println("It Is Pelindrom number ");
          }else {
        	  System.out.println("It is not pelidrom Number");
          }
	}

}
