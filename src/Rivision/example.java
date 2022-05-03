package Rivision;

public class example {
	public static void main(String[] args) {
			
		int a,b,x=60,y=46,z,hcf;
		a=x;
		b=y;
		
		while(b!=0) {
			z=b;
			b=a%b;
			a=z;
		}
		hcf=a;
		System.out.println("this Hcf "+hcf);
		}}
