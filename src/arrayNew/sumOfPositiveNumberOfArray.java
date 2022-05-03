package arrayNew;

public class sumOfPositiveNumberOfArray {

	public static void main(String[] args) {
		int []sk={10,20,-33,-55,2};
		int a=0;
		for(int i=0;i<sk.length;i++) {
			if(sk[i]>0) {
				 a=sk[i]+a;
			}

		}System.out.println(a);
		
	}

}
