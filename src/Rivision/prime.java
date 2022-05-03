package Rivision;

public class prime {
public static void main(String[] args) {
	int n=17	;
//	boolean prime = true;
	int count=0;
	for (int i=2;i<n;i++) {
		
		if(n%i==0) {
			count++;
			break;
	}
	}
	if(count>=1) {
		System.out.println("it is not prime");
	}else {
		System.out.println("prime");
	}
}}
