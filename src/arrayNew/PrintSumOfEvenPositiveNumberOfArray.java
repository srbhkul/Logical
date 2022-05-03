package arrayNew;

public class PrintSumOfEvenPositiveNumberOfArray {

	public static void main(String[] args) {
		int []sk={10,13, -14, -20, 22, 3};
		int a=0;
		for(int i=0;i<sk.length;i++) {
			if(sk[i]>0 && sk[i]%2==0) {
				a=sk[i]+a;
			}
			
		}System.out.println(a);
		
		
	}
}
