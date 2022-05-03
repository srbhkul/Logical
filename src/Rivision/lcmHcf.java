package Rivision;

	public class lcmHcf {
	
		public static void main(String[] args) {
			int x=25,y=90,z,hcf,a,b;
           a=x;
           b=y;
			while(y!=0) {
		     if(x>y) {
		    	 x=x-y;
		     }else {
		    	 y=y-x;
		     }
		    }
			hcf=x;
	
			System.out.println("HCF "+hcf);
            int lcm=(a*b)/hcf;
			System.out.println(lcm);
			
		}
	
	}
