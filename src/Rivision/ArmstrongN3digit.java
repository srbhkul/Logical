package Rivision;

public class ArmstrongN3digit{

	public static void main(String[] args) {
		int n = 153;
		int arm=0 ,c, rem;
		
		c=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
			}
		if(c==arm) {
		 System.out.println("This Is Arm Strong Number ");
		}else {
			System.out.println("this Is Not Armstrong Number ");
		}

	}

}
