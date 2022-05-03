package Rivision;

	public class Arm3for {
	
		public static void main(String[] args) {
			int n=153;
			int arm=0, c , rem;
		      c=n;
		      for (int i=n;i>0;i--) {
		    	  rem=n%10;
		    	  arm=(rem*rem*rem)+arm;
		    		n=n/10;
		    	}if (c==arm) {
		    		System.out.println("this is armstrong Number");
		    	}else {
		    		System.out.println("this is not armstrong Number");
		    	}
		int a=1%10;
		System.out.println(""+a);
		}
	
	}
