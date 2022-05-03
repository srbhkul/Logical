package Rivision;

public class largestamong3 {

	public static void main(String[] args) {
		int a=10;
		int b=600;
		int c=20;
		int large ,n	;
		
		n=a>b?a:b;
		large=c>n?c:n;

		System.out.println("the largest number is "+ large);
	}
}
